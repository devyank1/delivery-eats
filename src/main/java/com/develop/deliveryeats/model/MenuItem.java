package com.develop.deliveryeats.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_menuItem")
public class MenuItem {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String menuItemId;
    @ManyToOne
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurantId;
    private String name;
    private Double value;
    private boolean isAvailable;

    public String getMenuItemId() {
        return menuItemId;
    }

    public void setMenuItemId(String menuItemId) {
        this.menuItemId = menuItemId;
    }

    public Restaurant getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Restaurant restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
