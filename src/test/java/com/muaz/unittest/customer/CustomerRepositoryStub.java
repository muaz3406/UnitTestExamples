package com.muaz.unittest.customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by muazt on 30.01.2018.
 */
public class CustomerRepositoryStub extends CustomerRepository {

    private Map<Integer,Customer> customerList=new HashMap<Integer, Customer>();

    @Override
    public void save(Customer customer) {
        customerList.put(customer.getCustomerID(),customer);
    }

    @Override
    public void delete(Integer customerID) {
        customerList.remove(customerID);
    }

    @Override
    public Customer find(Integer customerID){

        return customerList.get(customerID);
    }

    public void allDelete(){
        customerList.clear();
    }
}
