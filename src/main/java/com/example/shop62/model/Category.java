package com.example.shop62.model;

/**
 * Класс, представляющий категорию товара.
 */
public class Category {
    /**
     * Уникальный идентификатор категории.
     */
    private Long id;
    /**
     * Название категории.
     */
    private String title;

    private CategoryType categoryType;

    /**
     * Конструктор по умолчанию.
     */
    public Category() {
    }

    /**
     * Конструктор с параметрами.
     *
     * @param id    уникальный идентификатор категории.
     * @param title название категории.
     */
    public Category(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    /**
     * Возвращает уникальный идентификатор категории.
     *
     * @return уникальный идентификатор категории.
     */
    public Long getId() {
        return id;
    }

    /**
     * Устанавливает уникальный идентификатор категории.
     *
     * @param id уникальный идентификатор категории.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Возвращает название категории.
     *
     * @return название категории.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Устанавливает название категории.
     *
     * @param title название категории.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    public CategoryType getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(CategoryType categoryType) {
        this.categoryType = categoryType;
    }
}

