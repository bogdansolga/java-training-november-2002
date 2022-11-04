package com.training.model;

public class Cat {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void purr() {
        System.out.println("Purring...");
    }

    public void makeKittens(Cat cat) {
        System.out.println(name + " is making kittens with " + cat.getName() + "...");
    }
}
