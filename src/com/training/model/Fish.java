package com.training.model;

import java.util.Objects;

public class Fish {
    private final String name;

    public Fish(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fish fish = (Fish) o;
        return Objects.equals(name, fish.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
