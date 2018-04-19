package com.muaz.unittest.mock;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SpyAnnotationTest {
@Spy
private DummyCustomerServiceImpl dummyCustomerService;



@Test
public void testAnnotation()throws Exception{
    dummyCustomerService.addCustomer("muaz");
}
}
