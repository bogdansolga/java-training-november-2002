package com.training.d03.s01.model;

public class Apple extends AbstractFruit {

    @Override
    public boolean canMakeJuiceFromIt() {
        return true;
    }

    @Override
    public String getName() {
        return "apple";
    }

    @Override
    public String getColor() {
        return "green or red or yellow";
    }
}
