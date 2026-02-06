package com.example.shop62;

import com.example.shop62.model.Role;
import com.example.shop62.model.User;
import com.example.shop62.repository.ProductRepository;
import com.example.shop62.repository.ProductRepositoryMap;
import com.example.shop62.repository.UserRepository;
import com.example.shop62.repository.UserRepositoryMap;

import java.time.LocalDateTime;

/**
 * Демонстрационный класс для работы с магазином.
 */
public class ShopDemo {
    /**
     * Главный метод приложения.
     *
     * @param args аргументы командной строки.
     */
    public static void main(String[] args) {
        // Создание администратора
        User admin = new User(
                "admin@shop.com",
                "admin123",
                "System Administrator",
                Role.ADMIN,
                LocalDateTime.now()
        );

        // Репозиторий пользователей
        UserRepository userRepository = new UserRepositoryMap();

//        userRepository.save(admin);

        // Чтение данных с консоли
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input email:");
//        String email = scanner.nextLine();

        // Создание менеджера
//        User manager = new User();
//        manager.setEmail(email);

        // Проверка содержимого хранилища
        userRepository.getAll().forEach(System.out::println);

        System.out.println("===============================================");

        // товары
        ProductRepository productRepository = new ProductRepositoryMap();
        productRepository.getAll().forEach(System.out::println);

//


    }
}