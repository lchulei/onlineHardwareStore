package com.solvd.laba.onlineHardwareStore.model;

import java.util.Date;

public class PurchaseHistory {
    private int id;
    private int clientId;
    private int orderId;
    private Date date;

    public PurchaseHistory() {

    }

    public PurchaseHistory(int id, int clientId, int orderId, Date date) {
        this.id = id;
        this.clientId = clientId;
        this.orderId = orderId;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "PurchaseHistory" +
                "id=" + id +
                ", clientId=" + clientId +
                ", orderId=" + orderId +
                ", date=" + date ;
    }
}
