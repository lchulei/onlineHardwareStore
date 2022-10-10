package com.solvd.laba.onlineHardwareStore.model;

public class Salary {
    private int id;
    private int amount;

    public Salary() {

    }

    public Salary(int id, int amount) {
        this.id = id;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Salary" +
                "id=" + id +
                ", amount=" + amount;
    }
}
