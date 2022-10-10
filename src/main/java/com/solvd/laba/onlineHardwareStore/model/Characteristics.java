package com.solvd.laba.onlineHardwareStore.model;

public class Characteristics {
    private int id;
    private int ram;
    private int rom;
    private float screenDiagonal;
    private int memoryCapacityOfTheVideoCard;
    private String processor;
    private float processorFrequency;
    private int mainCamera;
    private int frontCamera;
    private int batteryCapacity;
    private String operatingSystem;

    public Characteristics() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getRom() {
        return rom;
    }

    public void setRom(int rom) {
        this.rom = rom;
    }

    public float getScreenDiagonal() {
        return screenDiagonal;
    }

    public void setScreenDiagonal(float screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }

    public int getMemoryCapacityOfTheVideoCard() {
        return memoryCapacityOfTheVideoCard;
    }

    public void setMemoryCapacityOfTheVideoCard(int memoryCapacityOfTheVideoCard) {
        this.memoryCapacityOfTheVideoCard = memoryCapacityOfTheVideoCard;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public float getProcessorFrequency() {
        return processorFrequency;
    }

    public void setProcessorFrequency(float processorFrequency) {
        this.processorFrequency = processorFrequency;
    }

    public int getMainCamera() {
        return mainCamera;
    }

    public void setMainCamera(int mainCamera) {
        this.mainCamera = mainCamera;
    }

    public int getFrontCamera() {
        return frontCamera;
    }

    public void setFrontCamera(int frontCamera) {
        this.frontCamera = frontCamera;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    @Override
    public String toString() {
        return "Characteristics" +
                "id=" + id +
                ", ram=" + ram +
                ", rom=" + rom +
                ", screenDiagonal=" + screenDiagonal +
                ", memoryCapacityOfTheVideoCard=" + memoryCapacityOfTheVideoCard +
                ", processor=" + processor +
                ", processorFrequency=" + processorFrequency +
                ", mainCamera=" + mainCamera +
                ", frontCamera=" + frontCamera +
                ", batteryCapacity=" + batteryCapacity +
                ", operatingSystem=" + operatingSystem;
    }
}