package com.training.d03.s01.model;

public abstract class AbstractFruit {

    public abstract boolean canMakeJuiceFromIt();

    public abstract String getName();

    public abstract String getColor();

    public void displayColor() {
        // non-abstract method
    }

    // ... = variable arguments --> the method can be invoked with any number of arguments (0 -> n)
    // must be the last argument from the methods list
    public void variableArgumentsSample(String... arguments) {

    }
}
