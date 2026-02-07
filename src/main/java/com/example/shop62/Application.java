package com.example.shop62;

import com.example.shop62.config.AppConfig;
import com.example.shop62.processor.MessageProcessor;
import com.example.shop62.processor.SMSProcessor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Application {
    public static void main(String[] args) {
        // Создаем Spring контейнер
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Получаем bean из контейнера
        MessageProcessor processor = context.getBean(MessageProcessor.class);
        SMSProcessor SMSprocessor = context.getBean(SMSProcessor.class);

        // Использование
        processor.processMessage("Hello, Spring!", "test@example.com");
        SMSprocessor.SMSprocessMessage("Hello, Spring!", "+491723338800");

        // Закрываем контейнер
        context.close();
    }
}