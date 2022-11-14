package com.training.d03.s01.model;

public class Pomegranate extends AbstractFruit {

    @Override
    public boolean canMakeJuiceFromIt() {
        return true;
    }

    @Override
    public String getName() {
        return "pomegranate";
    }

    @Override
    public String getColor() {
        return "red";
    }
}
