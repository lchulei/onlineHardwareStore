package com.solvd.laba.onlineHardwareStore.model;

import java.util.Date;

public class Employee {
    private int id;
    private String name;
    private String surname;
    private int positionId;
    private int salaryId;
    private Date dateOfGettingStarted;
    private String phoneNumber;

    public Employee() {

    }

    public Employee(int id, String name, String surname, int positionId, int salaryId, Date dateOfGettingStarted, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.positionId = positionId;
        this.salaryId = salaryId;
        this.dateOfGettingStarted = dateOfGettingStarted;
        this.phoneNumber = phoneNumber;
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

    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }

    public int getSalaryId() {
        return salaryId;
    }

    public void setSalaryId(int salaryId) {
        this.salaryId = salaryId;
    }

    public Date getDateOfGettingStarted() {
        return dateOfGettingStarted;
    }

    public void setDateOfGettingStarted(Date dateOfGettingStarted) {
        this.dateOfGettingStarted = dateOfGettingStarted;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Employee" +
                "id=" + id +
                ", name=" + name+
                ", surname=" + surname +
                ", positionId=" + positionId +
                ", salaryId=" + salaryId +
                ", dateOfGettingStarted=" + dateOfGettingStarted +
                ", phoneNumber=" + phoneNumber;
    }
}
