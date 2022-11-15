package com.training.d04.s04;

import com.training.d03.s01.model.AbstractFruit;
import com.training.d03.s01.model.Apple;
import com.training.d03.s01.model.Banana;
import com.training.d03.s01.model.Pomegranate;

import java.util.HashMap;
import java.util.Map;

public class FruitsCollectionsMain {

    public static void main(String[] args) {
        //listsOfFruits();

        //setsOfFruits();

        mapsOfFruits();
    }

    private static void listsOfFruits() {
        // use a List of Apples or Bananas
        // use a List of AbstractFruit

        // add elements, display them, remove them
    }

    private static void setsOfFruits() {
        // use a HashSet, a TreeSet and a LinkedHashSet
    }

    private static void mapsOfFruits() {
        // use a HashMap and a TreeMap
        // use the fruits as values, the keys can be anything (Integer, String, ...)

        Map<String, AbstractFruit> basket = new HashMap<>();
        basket.put("first", new Apple());
        basket.put("second", new Banana());
        basket.put("third", new Pomegranate());

        final AbstractFruit removed = basket.remove("first");
        System.out.println("Was it removed? " + (removed != null));

        final AbstractFruit fruit = basket.get("second");
        System.out.println("The fruit with the key 'second' is a " + fruit.getName());

        System.out.println("We have now " + basket.size() + " fruits in our basket");
        for (AbstractFruit value : basket.values()) {
            System.out.println("\t" + value.getName() + ", " + value.canMakeJuiceFromIt());
        }
    }
}
