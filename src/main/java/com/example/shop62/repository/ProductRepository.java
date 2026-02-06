package com.example.shop62.repository;

import com.example.shop62.model.Category;
import com.example.shop62.model.Product;
import com.example.shop62.model.ProductStatus;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author : Nikolai Degtiarev
 * created : 04.02.26
 *
 *
 **/

// Интерфейс для репозитория товаров
public interface ProductRepository {
    // Возвращает список всех товаров
    List<Product> getAll();

    // Сохраняет товар
    Product save(Product product);

    // Обновляет товар
    Product update(Product product);

    // Удаляет товар по его идентификатору.
    Product delete(long id);

    // Возвращает товар по его идентификатору.
    Product getById(long id);

    // Возвращает список всех товаров по title
    List<Product> getByTitle(String title);

    // Возвращает список всех товаров по описанию
    List<Product> getByDescription(String description);

    // Возвращает список всех товаров по цене
    List<Product> getByPrice(BigDecimal price);

    // Возвращает список всех товаров по количеству на складе
    List<Product> getByQuantity(Integer stockQuantity);

    // Возвращает список всех товаров по статусу
    List<Product> getByStatus(ProductStatus status);

    // Возвращает список всех товаров по категории
    List<Product> getByCategory(Category category);
}
