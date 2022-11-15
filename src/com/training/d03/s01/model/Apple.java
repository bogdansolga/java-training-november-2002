package com.training.d03.s01.model;

public class Apple extends AbstractFruit {

    private String color;
    private String taste;

    public void setColor(String color) {
        this.color = color;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

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

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", taste='" + taste + '\'' +
                '}';
    }
}
