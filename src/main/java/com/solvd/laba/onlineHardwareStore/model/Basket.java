package com.solvd.laba.onlineHardwareStore.model;

public class Basket {
    private int id;
    private int clientId;

    public Basket() {

    }

    public Basket(int id, int clientId) {
        this.id = id;
        this.clientId = clientId;
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

    @Override
    public String toString() {
        return "Basket" +
                "id=" + id +
                ", clientId=" + clientId;
    }
}
