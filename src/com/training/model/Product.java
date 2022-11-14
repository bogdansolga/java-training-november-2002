package com.training.model;

import java.util.ArrayList;
import java.util.List;

public class Product {
    // properties / fields

    public static final String TABLE_NAME = "Product";

    protected static final List<String> STRINGS; // blank final variable

    static {
        System.out.println("Initializing the class...");

        STRINGS = new ArrayList<>(10);
        STRINGS.add("something");
    }

    private final int id;
    private final String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static Product createProduct(int id, String name) {
        return new Product(id, name);
    }

    public void process() {
        System.out.println("Processing the product '" + name + "'...");
    }
}
