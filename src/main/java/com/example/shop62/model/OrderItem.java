package com.example.shop62.model;

import java.math.BigDecimal;

/**
 * Класс, представляющий позицию в заказе.
 */
public class OrderItem {
    /**
     * Уникальный идентификатор позиции в заказе.
     */
    private Long id;
    /**
     * Заказ, к которому относится данная позиция.
     */
    private Order order;
    /**
     * Товар в данной позиции заказа.
     */
    private Product product;
    /**
     * Количество единиц товара.
     */
    private Integer quantity;           // Сколько единиц товара купили
    /**
     * Цена за единицу товара на момент покупки.
     */
    private BigDecimal pricePerUnit;    // Цена единицы на момент покупки!
}
