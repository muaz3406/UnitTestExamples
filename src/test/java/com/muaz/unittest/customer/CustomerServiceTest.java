package com.muaz.unittest.customer;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class CustomerServiceTest {

    private CustomerService customerService;
    //1private CustomerRepository customerRepository;

    private CustomerRepositoryStub customerRepository=new CustomerRepositoryStub();

    private NotificationService notificationService;

    @Before
    public void setUp() throws Exception {

        customerService=new CustomerService();
        //1customerRepository=Mockito.mock(CustomerRepository.class);
        notificationService =Mockito.mock(NotificationService.class);
        customerService.setCustomerRepository(customerRepository);
        customerService.setNotificationService(notificationService);
    }

    @After
    public void after(){
        customerRepository.allDelete();
    }

    @Test
    public void testCustomerSave() throws Exception {

       //1 Customer customer=new Customer();
        Customer customer=new Customer(1234);

        customerService.customerSave(customer);


        //Mockito.verify(customerRepository).save(customer);
        //assertTrue(customerRepository.getCustomerList().containsValue(customer));
        assertEquals(customer,customerRepository.find(customer.getCustomerID()));
        Mockito.verify(notificationService).newSaveSendMail(customer);

    }

    @Test
    public void testCustomerDelete() throws Exception{

        customerService.customerDelete(1234);
        assertNull(customerRepository.find(1234));
    }
}
