package com.training.model;

public class Laptop extends Product {
    private String serialNumber;

    public Laptop(int id, String name) {
        super(id, name); // invoking the constructor from the parent class
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

    @Override
    public void process() {
        System.out.println("Processing the laptop '" + getName() + "'...");
        super.process(); // invoking the 'process()' method from the parent class
        // the 'process()' method cannot be invoked as Product.process(), as 'process()' is not static in the Product class
    }
}
