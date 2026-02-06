package com.example.shop62.model;

import java.math.BigDecimal;

/**
 * Класс, представляющий товар.
 */
public class Product {
    /**
     * Уникальный идентификатор товара.
     */
    private Long id;
    /**
     * Название товара.
     */
    private String title;
    /**
     * Описание товара.
     */
    private String description;
    /**
     * Цена товара.
     */
    private BigDecimal price;
    /**
     * Количество товара на складе.
     */
    private Integer stockQuantity;
    /**
     * Статус товара.
     */
    private ProductStatus status;
    /**
     * Категория товара.
     */
    private Category category;
    /**
     * URL изображения товара.
     */
    private String imageUrl;

    /**
     * Конструктор по умолчанию.
     */
    public Product() {
    }

    /**
     * Конструктор с параметрами.
     *
     * @param title         название товара.
     * @param description   описание товара.
     * @param price         цена товара.
     * @param stockQuantity количество товара на складе.
     * @param status        статус товара.
     * @param category      категория товара.
     * @param imageUrl      URL изображения товара.
     */
    public Product(String title, String description, BigDecimal price, Integer stockQuantity, ProductStatus status, Category category, String imageUrl) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.status = status;
        this.category = category;
        this.imageUrl = imageUrl;
    }

    /**
     * Возвращает уникальный идентификатор товара.
     *
     * @return уникальный идентификатор товара.
     */
    public Long getId() {
        return id;
    }

    /**
     * Устанавливает уникальный идентификатор товара.
     *
     * @param id уникальный идентификатор товара.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Возвращает название товара.
     *
     * @return название товара.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Устанавливает название товара.
     *
     * @param title название товара.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Возвращает описание товара.
     *
     * @return описание товара.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Устанавливает описание товара.
     *
     * @param description описание товара.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Возвращает цену товара.
     *
     * @return цена товара.
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Устанавливает цену товара.
     *
     * @param price цена товара.
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * Возвращает количество товара на складе.
     *
     * @return количество товара на складе.
     */
    public Integer getStockQuantity() {
        return stockQuantity;
    }

    /**
     * Устанавливает количество товара на складе.
     *
     * @param stockQuantity количество товара на складе.
     */
    public void setStockQuantity(Integer stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    /**
     * Возвращает статус товара.
     *
     * @return статус товара.
     */
    public ProductStatus getStatus() {
        return status;
    }

    /**
     * Устанавливает статус товара.
     *
     * @param status статус товара.
     */
    public void setStatus(ProductStatus status) {
        this.status = status;
    }

    /**
     * Возвращает категорию товара.
     *
     * @return категория товара.
     */
    public Category getCategory() {
        return category;
    }

    /**
     * Устанавливает категорию товара.
     *
     * @param category категория товара.
     */
    public void setCategory(Category category) {
        this.category = category;
    }

    /**
     * Возвращает URL изображения товара.
     *
     * @return URL изображения товара.
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * Устанавливает URL изображения товара.
     *
     * @param imageUrl URL изображения товара.
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
