package com.develop.deliveryeats.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_orderitem")
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String orderItemId;
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order orderId;
    @ManyToOne
    @JoinColumn(name = "menuitem_id")
    private MenuItem menuItemId;
    private Long quantity;
    private Double price;

    public String getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
    }

    public Order getOrderId() {
        return orderId;
    }

    public void setOrderId(Order orderId) {
        this.orderId = orderId;
    }

    public MenuItem getMenuItemId() {
        return menuItemId;
    }

    public void setMenuItemId(MenuItem menuItemId) {
        this.menuItemId = menuItemId;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
