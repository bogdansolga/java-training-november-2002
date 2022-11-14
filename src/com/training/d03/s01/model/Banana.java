package com.training.d03.s01.model;

public class Banana extends AbstractFruit {

    @Override
    public boolean canMakeJuiceFromIt() {
        return false;
    }

    @Override
    public String getName() {
        return "banana";
    }

    @Override
    public String getColor() {
        return "yellow";
    }
}
