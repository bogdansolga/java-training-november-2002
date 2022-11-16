package com.training.d05.s01;

import com.training.d03.s01.model.AbstractFruit;
import com.training.d03.s01.model.Apple;
import com.training.d03.s01.model.Banana;
import com.training.d03.s01.model.Pomegranate;

import java.util.HashSet;
import java.util.Set;

public class ExceptionsUsageExercise {

    public static void main(String[] args) {
        //usingCheckedExceptions();

        usingUncheckedExceptions();
    }

    private static void usingCheckedExceptions() {
        // invoke a method which throws a checked exception - Date parsing, FileReader creation, ...
        // handle that exception:
        //  1. in a try-catch block
        //  2. add the 'throws' detail to the method, handle it in the main method
    }

    private static void usingUncheckedExceptions() {
        // create a fruits basket, add some fruits to it
        // simulate the obtaining of a fruit from that basket, throw an unchecked exception if it is not found
        //  the NotFoundException, if you want

        Set<AbstractFruit> basket = new HashSet<>();
        basket.add(new Banana());

        final Apple apple = new Apple();
        apple.setColor("De care vrei");
        basket.add(apple);

        basket.add(new Pomegranate());

        AbstractFruit abstractFruit = findFruitByNameOrThrow(basket, "apple");
        System.out.println("The fruit color is '" + abstractFruit.getColor() + "");
    }

    private static AbstractFruit findFruitByNameOrThrow(Set<AbstractFruit> basket, String fruitName) {
        for (AbstractFruit fruit : basket) {
            if (fruit.getName().equals(fruitName)) {
                return fruit;
            }
        }

        throw new NotFoundException("There is no fruit with the name '" + fruitName + "'");
    }
}
