package com.training.d03.s01.model;

public abstract class AbstractFruit {

    public abstract boolean canMakeJuiceFromIt();

    public abstract String getName();

    public abstract String getColor();

    public void displayColor() {
        // non-abstract method
    }
}
