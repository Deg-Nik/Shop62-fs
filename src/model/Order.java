package model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author : Nikolai Degtiarev
 * created : 01.02.26
 *
 *
 **/
public class Order {
    private Long id;
    private User user;
    private BigDecimal totalAmount;
    private LocalDateTime createdAt;
    private String shippingAddress;
    private OrderStatus status;
    private List<OrderItem> items;
}
