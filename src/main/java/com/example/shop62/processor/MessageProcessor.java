package com.example.shop62.processor;


import org.springframework.stereotype.Component;
import com.example.shop62.service.MessageService;

@Component
public class MessageProcessor {
    private final MessageService messageService;

    public MessageProcessor(MessageService messageService) {
        this.messageService = messageService;
        System.out.println("processor.MesageProcessor created with: " + messageService.getClass().getSimpleName());
    }

    public void processMessage(String message, String recipient) {
        System.out.println("\n=== Processing Message ===");
        messageService.sendMessage(message, recipient);
        System.out.println("\n=== Message Processed ===\n");
    }
}
