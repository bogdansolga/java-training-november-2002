package com.training.d04.s01;

import java.util.LinkedList;
import java.util.List;

public abstract class AbstractStack<Element> { // Element --> generic type

    private final List<Element> elements = new LinkedList<>();

    public void add(Element element) {
        elements.add(element);
    }

    public void remove(Element element) {
        elements.remove(element);
    }
}
