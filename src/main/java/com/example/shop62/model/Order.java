package com.example.shop62.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Класс, представляющий заказ.
 */
public class Order {
    /**
     * Уникальный идентификатор заказа.
     */
    private Long id;
    /**
     * Пользователь, сделавший заказ.
     */
    private User user;
    /**
     * Общая сумма заказа.
     */
    private BigDecimal totalAmount;
    /**
     * Дата и время создания заказа.
     */
    private LocalDateTime cratedAt;
    /**
     * Адрес доставки.
     */
    private String shippingAddress;
    /**
     * Статус заказа.
     */
    private OrderStatus status;
    /**
     * Список позиций в заказе.
     */
    private List<OrderItem> items;
}