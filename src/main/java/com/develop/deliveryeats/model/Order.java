package com.develop.deliveryeats.model;

import com.develop.deliveryeats.enums.OrderStatus;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String orderId;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User userId;
    @OneToOne
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurantId;
    @OneToOne
    @JoinColumn(name = "driver_id")
    private Driver driverId;
    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;
    private String deliveryAddress;
    private Double totalPrice;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
