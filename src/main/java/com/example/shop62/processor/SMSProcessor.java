package com.example.shop62.processor;
import com.example.shop62.service.SMSService;
import org.springframework.stereotype.Component;


@Component
public class SMSProcessor {
    private final SMSService SMSmessageService;

    public SMSProcessor(SMSService SMSmessageService) {
        this.SMSmessageService = SMSmessageService;
        System.out.println("processor.SMSProcessor created with: " + SMSmessageService.getClass().getSimpleName());
    }

    public void SMSprocessMessage(String message, String recipient) {
        System.out.println("\n=== Processing SMS Message ===");
        SMSmessageService.sendSMS(message, recipient);
        System.out.println("\n=== SMS Message Processed ===\n");
    }
}
