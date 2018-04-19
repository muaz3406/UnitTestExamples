package com.muaz.unittest.mock;


import org.junit.Test;
import org.mockito.InOrder;

import static org.mockito.Mockito.*;

public class BehaviourTest {
    @Test
    public void testBehavior() throws Exception{

        DummyCustomerService customerService= mock(DummyCustomerService.class);

        customerService.addCustomer("istanbul");
        customerService.addCustomer("ankara");

        verify(customerService).addCustomer("istanbul");
        verify(customerService).addCustomer("ankara");    }

        @Test
    public void testNumberOfMethodInvocations() throws Exception{
        DummyCustomerService customerService=mock(DummyCustomerService.class);

        customerService.addCustomer("istanbul");
            customerService.addCustomer("istanbul");
            customerService.addCustomer("istanbul");
            customerService.addCustomer("istanbul");
            customerService.addCustomer("izmir");
            customerService.addCustomer("istanbul");

             verify(customerService,times(5)).addCustomer("istanbul");
            verify(customerService,times(1)).addCustomer("izmir");


            verify(customerService,never()).removeCustomer(anyString());

            verify(customerService,never()).addCustomer("ankara");

            verify(customerService,atLeast(1)).addCustomer("izmir");
    }

    @Test
    public void testOrderControl() throws Exception{
        DummyCustomerService customerService=mock(DummyCustomerService.class);

        customerService.addCustomer("istanbul");
        customerService.addCustomer("ankara");
        customerService.updateCustomer("izmir");

        InOrder inOrder=inOrder(customerService);
        inOrder.verify(customerService).addCustomer("istanbul");
        inOrder.verify(customerService).addCustomer("ankara");
        inOrder.verify(customerService).updateCustomer("izmir");

    }


    @Test
    public void testNoMoreInteractions(){
        DummyCustomerService customerService=mock(DummyCustomerService.class);


        customerService.addCustomer("istanbul");
        customerService.addCustomer("ankara");

      verify(customerService).addCustomer("istanbul");
        verify(customerService).addCustomer("ankara");

        verifyNoMoreInteractions(customerService);
    }

    @Test
    public void testZeroInteractions(){
        DummyCustomerService customerService=mock(DummyCustomerService.class);
        DummyCustomerService customerService2=mock(DummyCustomerService.class);


        customerService.addCustomer("istanbul");
        customerService.addCustomer("ankara");



        verify(customerService).addCustomer("istanbul");
        verify(customerService).addCustomer("ankara");

        verifyZeroInteractions(customerService2);
    }
}
