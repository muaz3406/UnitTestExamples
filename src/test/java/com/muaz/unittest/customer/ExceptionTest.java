package com.muaz.unittest.customer;


import com.muaz.unittest.customer.exception.MailServerUnavailableException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class ExceptionTest {

    private NotificationService notificationService =new NotificationService();


    @Test
    public void testTryCatchException(){
        try{
            notificationService.weeklySendMail();
        }catch (Exception ex){
            assertTrue(ex instanceof MailServerUnavailableException);
            assertEquals("mailServer give an  error",ex.getMessage());
        }
    }

    @Test(expected=MailServerUnavailableException.class)
    public void testExpectedException() throws Exception{
        notificationService.weeklySendMail();
    }

    @Rule
    public ExpectedException thrown=ExpectedException.none();

    @Test
    public void testRuleExpection()throws Exception{
            thrown.expect(MailServerUnavailableException.class);
            thrown.expectMessage("mail server error");
            NotificationService.weeklySendMail();
    }


}
