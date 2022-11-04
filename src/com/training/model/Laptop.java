package com.training.model;

public class Laptop {
    private String serialNumber;

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void start() {
        System.out.println("Starting the '" + serialNumber + "' laptop...");
    }
}
