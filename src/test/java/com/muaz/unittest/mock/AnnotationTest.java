package com.muaz.unittest.mock;


import com.muaz.unittest.assertj.CustomerRepository;
import com.muaz.unittest.assertj.CustomerService;
import com.muaz.unittest.assertj.NotificationService;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class AnnotationTest {

    @InjectMocks
    private CustomerService customerService;
    @Mock
    private CustomerRepository customerRepository;
    @Mock
    private NotificationService notificationService;


    @Test
    public void testAnnotation() throws Exception{
        customerService.handleNewCustomer("name","email");
    }


}
