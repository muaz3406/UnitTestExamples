package com.muaz.unittest.assertj;


import com.muaz.unittest.customer.exception.MailServerUnavailableException;

public class NotificationService {

    public void newSaveSendMail(Customer customer){
        System.out.println("new customer");
    }

    public static void weeklySendMail(){
        throw new MailServerUnavailableException("mail server error");
    }


    public void sendWelcomeNotification(Customer customer, String email) {
    }
}
