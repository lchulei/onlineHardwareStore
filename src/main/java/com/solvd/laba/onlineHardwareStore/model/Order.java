package com.solvd.laba.onlineHardwareStore.model;

public class Order {
    private int id;
    private int basketId;
    private String paymentMathod;
    private String total;
    private int employeeId;

    public Order() {

    }

    public Order(int id, int basketId, String paymentMathod, String total, int employeeId) {
        this.id = id;
        this.basketId = basketId;
        this.paymentMathod = paymentMathod;
        this.total = total;
        this.employeeId = employeeId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBasketId() {
        return basketId;
    }

    public void setBasketId(int basketId) {
        this.basketId = basketId;
    }

    public String getPaymentMathod() {
        return paymentMathod;
    }

    public void setPaymentMathod(String paymentMathod) {
        this.paymentMathod = paymentMathod;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "Order" +
                "id=" + id +
                ", basketId=" + basketId +
                ", paymentMathod=" + paymentMathod +
                ", total=" + total +
                ", employeeId=" + employeeId;
    }
}
