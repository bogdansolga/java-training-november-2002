package com.training.d04.s04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorMain {

    public static void main(String[] args) {
        stringIteratorExample();

        fruitsIteratorExample();
    }

    private static void fruitsIteratorExample() {
        // TODO
        //  create a collection of fruits (List or Set, as you wish)
        //  add some fruits to it
        //  iterate over the collection, remove the fruits from which we cannot make juice, display the others
    }

    private static void stringIteratorExample() {
        List<String> strings = new ArrayList<>(
                Arrays.asList("Java is a nice programming language, pretty elegant and almost simple".split(" ")));
        System.out.println(strings.size());

        final Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            final String nextElement = iterator.next();
            if (nextElement.length() < 4) {
                iterator.remove();
            }
        }

        System.out.println(strings);
    }
}
