package com.solvd.laba.onlineHardwareStore.model;

import java.util.Date;

public class Client {
    private int id;
    private String name;
    private String surname;
    private Date birthDate;
    private String phoneNumber;
    private String address;

    public Client() {

    }

    public Client(int id, String name, String surname, Date birthDate, String phoneNumber, String address) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.address = address;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Client" +
                "id=" + id +
                ", name=" + name +
                ", surname=" + surname +
                ", birthDate=" + birthDate +
                ", phoneNumber=" + phoneNumber +
                ", address=" + address;
    }
}