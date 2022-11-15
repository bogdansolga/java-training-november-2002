package com.training.d04.s02;

import com.training.d03.s01.model.AbstractFruit;

public abstract class AbstractFruitProcessor<Fruit extends AbstractFruit> {

    public void process(Fruit fruit) {
        System.out.println("Processing the " + fruit);
    }
}
