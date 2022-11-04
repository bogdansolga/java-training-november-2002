package com.training.model;

public class Laptop extends Product {
    private String serialNumber;

    public Laptop(int id, String name) {
        super(id, name);
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void start() {
        System.out.println("Starting the '" + serialNumber + "' laptop...");
    }

    public void process() {
        System.out.println("Processing the laptop '" + getName() + "'...");
    }
}
