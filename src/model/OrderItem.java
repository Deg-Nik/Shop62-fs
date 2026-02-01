package model;

import java.math.BigDecimal;

/**
 * @author : Nikolai Degtiarev
 * created : 01.02.26
 *
 *
 **/
public class OrderItem {
    private Long id;
    private Order order;
    private Product product;
    private Integer quantity;
    private BigDecimal pricePerUnit;
}
