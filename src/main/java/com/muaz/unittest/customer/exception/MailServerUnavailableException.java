package com.muaz.unittest.customer.exception;

/**
 * Created by muazt on 1.02.2018.
 */
public class MailServerUnavailableException extends RuntimeException {

    public MailServerUnavailableException(String msg){
        super(msg);
    }
}
