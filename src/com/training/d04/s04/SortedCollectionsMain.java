package com.training.d04.s04;

import com.training.d03.s01.model.Apple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortedCollectionsMain {

    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>();
        apples.add(createApple("red", "sweet"));
        apples.add(createApple("yellow", "almost sweet"));
        apples.add(createApple("green", "sour"));
        System.out.println(apples.size());

        System.out.println("Before sorting:");
        for (Apple apple : apples) {
            System.out.println(apple);
        }
        System.out.println("----------------------------------------------------------");

        Collections.sort(apples);

        System.out.println("After sorting:");
        for (Apple apple : apples) {
            System.out.println(apple);
        }
    }

    private static Apple createApple(String color, String taste) {
        Apple apple = new Apple();
        apple.setColor(color);
        apple.setTaste(taste);
        return apple;
    }
}
