package com.example.shop62;

import com.example.shop62.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.example.shop62.processor.MesageProcessor;


public class Application {
    public static void main(String[] args) {
        // Создаем Spring контейнер
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Получаем bean из контейнера
        MesageProcessor processor = context.getBean(MesageProcessor.class);

        // Использование
        processor.processMessage("Hello, Spring!", "test@example.com");

        // Закрываем контейнер
        context.close();
    }
}