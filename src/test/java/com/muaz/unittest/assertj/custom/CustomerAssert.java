package com.muaz.unittest.assertj.custom;


import com.muaz.unittest.assertj.Customer;
import org.assertj.core.api.AbstractAssert;

public class CustomerAssert extends AbstractAssert<CustomerAssert,Customer>
{
    public CustomerAssert(Customer customer, Class<?> selfType) {
        super(customer, selfType);
    }
}
