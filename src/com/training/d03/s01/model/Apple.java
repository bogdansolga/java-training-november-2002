package com.training.d03.s01.model;

import java.util.Comparator;
import java.util.Objects;

public class Apple extends AbstractFruit implements Comparable<Apple> {

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
        return color;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", taste='" + taste + '\'' +
                '}';
    }

    @Override
    public int compareTo(Apple apple) {
        //return getColor().compareTo(apple.getColor());
        //return getTaste().compareTo(apple.getTaste());
        return Comparator.comparing(Apple::getTaste) // :: method references, since Java 8
                         .thenComparing(Apple::getColor)
                         .compare(this, apple);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apple apple = (Apple) o;
        return Objects.equals(color, apple.color) && Objects.equals(taste, apple.taste);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, taste);
    }
}
