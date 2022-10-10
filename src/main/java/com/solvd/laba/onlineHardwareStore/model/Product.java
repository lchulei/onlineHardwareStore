package com.solvd.laba.onlineHardwareStore.model;

import java.util.Date;

public class Product {
    private int id;
    private String name;
    private String producer;
    private Date dataOfManufacture;
    private float price;
    private String producingCountry;
    private int amount;
    private int characteristicsId;
    private int providerId;

    public Product() {

    }

    public Product(int id, String name, String producer, Date dataOfManufacture,
                   float price, String producingCountry, int amount, int characteristicsId, int providerId) {
        this.id = id;
        this.name = name;
        this.producer = producer;
        this.dataOfManufacture = dataOfManufacture;
        this.price = price;
        this.producingCountry = producingCountry;
        this.amount = amount;
        this.characteristicsId = characteristicsId;
        this.providerId = providerId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public Date getDataOfManufacture() {
        return dataOfManufacture;
    }

    public void setDataOfManufacture(Date dataOfManufacture) {
        this.dataOfManufacture = dataOfManufacture;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getProducingCountry() {
        return producingCountry;
    }

    public void setProducingCountry(String producingCountry) {
        this.producingCountry = producingCountry;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getCharacteristicsId() {
        return characteristicsId;
    }

    public void setCharacteristicsId(int characteristicsId) {
        this.characteristicsId = characteristicsId;
    }

    public int getProviderId() {
        return providerId;
    }

    public void setProviderId(int providerId) {
        this.providerId = providerId;
    }

    @Override
    public String toString() {
        return "Product" +
                "id=" + id +
                ", name=" + name +
                ", producer=" + producer +
                ", dataOfManufacture=" + dataOfManufacture +
                ", price=" + price +
                ", producingCountry=" + producingCountry +
                ", amount=" + amount +
                ", characteristicsId=" + characteristicsId +
                ", providerId=" + providerId;
    }
}
