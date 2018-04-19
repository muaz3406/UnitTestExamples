package com.muaz.unittest.customer;


public class CustomerRepository {

    public void save(Customer customer){
        System.out.println("Customer saved");
    }

    public void delete(Integer customerID){
        System.out.println("customer deleted");
    }

    public Customer find(Integer customerID){
        System.out.println("DB find customer");
      return null;
    }
}
