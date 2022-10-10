package com.solvd.laba.onlineHardwareStore.model;

public class BasketHasProduct {
    private int basketId;
    private int productId;
    private int amount;

    public BasketHasProduct() {

    }

    public BasketHasProduct(int basketId, int productId, int amount) {
        this.basketId = basketId;
        this.productId = productId;
        this.amount = amount;
    }

    public int getBasketId() {
        return basketId;
    }

    public void setBasketId(int basketId) {
        this.basketId = basketId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "BasketHasProduct" +
                "basketId=" + basketId +
                ", productId=" + productId +
                ", amount=" + amount;
    }
}