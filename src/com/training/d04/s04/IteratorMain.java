package com.training.d04.s04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorMain {

    public static void main(String[] args) {
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
