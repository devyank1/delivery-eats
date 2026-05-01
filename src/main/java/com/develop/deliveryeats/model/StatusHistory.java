package com.develop.deliveryeats.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_statusHistory")
public class StatusHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String statusHistoryId;
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order orderId;
    private String fromStatus;
    private String toStatus;
    private String changedByUserId;
    private LocalDateTime changedAt;

    public String getStatusHistoryId() {
        return statusHistoryId;
    }

    public void setStatusHistoryId(String statusHistoryId) {
        this.statusHistoryId = statusHistoryId;
    }

    public Order getOrderId() {
        return orderId;
    }

    public void setOrderId(Order orderId) {
        this.orderId = orderId;
    }

    public String getFromStatus() {
        return fromStatus;
    }

    public void setFromStatus(String fromStatus) {
        this.fromStatus = fromStatus;
    }

    public String getToStatus() {
        return toStatus;
    }

    public void setToStatus(String toStatus) {
        this.toStatus = toStatus;
    }

    public String getChangedByUserId() {
        return changedByUserId;
    }

    public void setChangedByUserId(String changedByUserId) {
        this.changedByUserId = changedByUserId;
    }

    public LocalDateTime getChangedAt() {
        return changedAt;
    }

    public void setChangedAt(LocalDateTime changedAt) {
        this.changedAt = changedAt;
    }
}
