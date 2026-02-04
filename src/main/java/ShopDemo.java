import model.Role;
import model.User;
import repository.UserRepository;
import repository.UserRepositoryMap;

import java.time.LocalDateTime;
import java.util.Scanner;

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

    }
}