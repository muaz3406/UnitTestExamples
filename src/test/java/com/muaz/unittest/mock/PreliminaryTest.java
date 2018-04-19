package com.muaz.unittest.mock;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.*;

public class PreliminaryTest {

    @Test
    public void testWhen() throws Exception{

        DummyCustomerService service=mock(DummyCustomerService.class);
        when(service.getCustomer(anyString())).thenReturn("customerIstanbul");
        String customer=service.getCustomer("istanbul");
        assertThat(customer).isEqualTo("customerIstanbul");
}

    @Test
    public void testWhen2()throws Exception{
        DummyCustomerService service=mock(DummyCustomerService.class);
    when(service.getCustomer(eq("ankara"))).thenThrow(new RuntimeException());
    String customer=service.getCustomer("istanbul");

}


    @Test
    public void testWhen3()throws Exception{
        DummyCustomerService service=mock(DummyCustomerService.class);

        doNothing().when(service).addCustomer(anyString());

        doThrow(new RuntimeException()).when(service).addCustomer(anyString());
        doReturn("ankara").when(service).addCustomer("istanbul");
    }
}
