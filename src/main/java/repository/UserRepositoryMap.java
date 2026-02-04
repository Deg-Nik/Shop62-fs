package repository;

import model.Role;
import model.User;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Реализация репозитория пользователей, использующая {@link HashMap} в качестве хранилища.
 */
public class UserRepositoryMap implements UserRepository {
    /**
     * Хранилище пользователей в памяти.
     */
    private Map<Long, User> memoryStorage = new HashMap<>();
    /**
     * Текущий идентификатор для нового пользователя.
     */
    private long currentId; //0

    /**
     * Конструктор по умолчанию, инициализирующий хранилище.
     */
    public UserRepositoryMap() {
        initStorage();
    }

    /**
     * Метод для заполнения хранилища начальными данными.
     */
    private void initStorage() {
        save(new User("admin@shop.com", "adminpass", "Admin User", Role.ADMIN, LocalDateTime.now()));
        save(new User("manager1@shop.com", "managerpass1", "Manager One", Role.MANAGER, LocalDateTime.now()));
        save(new User("manager2@shop.com", "managerpass2", "Manager Two", Role.MANAGER, LocalDateTime.now()));
        save(new User("customer1@example.com", "pass1", "John Doe", Role.CUSTOMER, LocalDateTime.now()));
        save(new User("customer2@example.com", "pass2", "Jane Smith", Role.CUSTOMER, LocalDateTime.now()));
        save(new User("customer3@example.com", "pass3", "Peter Jones", Role.CUSTOMER, LocalDateTime.now()));
        save(new User("customer4@example.com", "pass4", "Mary Williams", Role.CUSTOMER, LocalDateTime.now()));
        save(new User("customer5@example.com", "pass5", "David Brown", Role.CUSTOMER, LocalDateTime.now()));
        save(new User("customer6@example.com", "pass6", "Susan Davis", Role.CUSTOMER, LocalDateTime.now()));
        save(new User("customer7@example.com", "pass7", "Michael Miller", Role.CUSTOMER, LocalDateTime.now()));
    }

    @Override
    public List<User> getAll() {
        return memoryStorage.values().stream().toList();
    }

    @Override
    public User save(User user) {
        user.setId(++currentId);
        memoryStorage.put(user.getId(), user);
        return user;
    }

    @Override
    public User update(User user) {
        Long id = user.getId();
        String newEmail = user.getEmail();

        User userToUpdate = memoryStorage.getOrDefault(id, null);
        if (userToUpdate == null) return null;

        userToUpdate.setEmail(newEmail);
        return userToUpdate;
    }

    @Override
    public User getById(long id) {
        return memoryStorage.getOrDefault(id, null);
    }

    @Override
    public User getByEmail(String email) {
        if (email == null) return null;

        return memoryStorage.values().stream()
                .filter(user -> user.getEmail().equals(email))
                .findFirst()
                .orElse(null);
    }

    @Override
    public User delete(long id) {
        return memoryStorage.remove(id);
    }
}