package com.muaz.unittest.mock;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MockAnnotationTest {

    @Mock
    private DummyCustomerService dummyCustomerService;


    @Test
    public void testAnnotation()throws Exception{
dummyCustomerService.addCustomer("muaz");
    }
}
