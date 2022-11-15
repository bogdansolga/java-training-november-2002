package com.training.d04.s04;

import com.training.d03.s01.model.Apple;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsMain {

    public static void main(String[] args) {
        //listExample();

        //setExample();

        mapExample();
    }

    private static void mapExample() {
        // a Map stores _pairs of elements_
        // the keys _must_ be distinct, the values must not be
        Map<Integer, String> weekDays = new HashMap<>();
        weekDays.put(1, "Monday");
        weekDays.put(3, "Wednesday");
        System.out.println(weekDays);

        weekDays.put(1, "Sunday"); // be careful when replacing entries

        final Set<Integer> keySet = weekDays.keySet();
        System.out.println("The keys are " + keySet);

        // the method '.values()' returns a Collection because the values may be distinct or not
        final Collection<String> values = weekDays.values();
        System.out.println("The values are " + values);

        final Set<Map.Entry<Integer, String>> entries = weekDays.entrySet();
        System.out.println("The entries are " + entries);
    }

    private static void setExample() {
        Set<String> values = new TreeSet<>();
        values.add("first");
        values.add("second");
        values.add("fourth");
        System.out.println(values);

        for (String value : values) {
            // we can easily iterate over the values
        }

        Set<Apple> apples = new TreeSet<>();
    }

    private static void listExample() {
        // using the object as a List - allows us to change the implementation without changes in the object type
        List<String> weekDays = createNewList();
        weekDays.add("Monday");
        weekDays.addAll(Arrays.asList("Tuesday", "Wednesday"));
        System.out.println("The day with the index 3 is " + weekDays.get(2));
        System.out.println(weekDays.remove(1));
        System.out.println("The size is now " + weekDays.size() + ", the elements are " + weekDays.toString());

        for (String weekDay : weekDays) {
            // we can easily iterate over the values
        }
    }

    private static List<String> createNewList() {
        //return new ArrayList<>();
        return new LinkedList<>();
    }
}
