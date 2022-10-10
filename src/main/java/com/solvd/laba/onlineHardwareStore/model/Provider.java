package com.solvd.laba.onlineHardwareStore.model;

public class Provider {
    private int id;
    private String companyName;
    private String contractNumber;

    public Provider() {

    }

    public Provider(int id, String companyName, String contractNumber) {
        this.id = id;
        this.companyName = companyName;
        this.contractNumber = contractNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    @Override
    public String toString() {
        return "Provider" +
                "id=" + id +
                ", companyName=" + companyName +
                ", contractNumber=" + contractNumber;
    }
}
