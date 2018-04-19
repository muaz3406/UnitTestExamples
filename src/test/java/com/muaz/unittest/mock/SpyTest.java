package com.muaz.unittest.mock;


import org.junit.Test;

import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.*;

public class SpyTest {

    @Test
    public void testSpy() throws Exception{

        DummyCustomerService service=spy(new DummyCustomerServiceImpl());

        doNothing().when(service).addCustomer(eq("istanbul"));
        doThrow(new IllegalArgumentException()).when(service).removeCustomer(anyString());
        doNothing().when(service).addCustomer(eq("istanbul1"));
        doNothing().when(service).addCustomer(eq("istanbul2"));
        doCallRealMethod().when(service).addCustomer(eq("istanbul3"));

        service.addCustomer("istanbul1");
        service.addCustomer("istanbul2");
        service.addCustomer("istanbul3");

    }
}
