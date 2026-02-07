package com.example.shop62.service;

import org.springframework.stereotype.Component;

@Component
public class EmailService implements MessageService, SMSService {
    @Override
    public void sendMessage(String message, String recipient) {
        System.out.println("Sending Email to " + recipient);
        System.out.println("Message: " + message);
    }

    @Override
    public void sendSMS(String message, String recipient) {
        System.out.println("Sending SMS to " + recipient);
        System.out.println("Message: " + message);
    }
}
