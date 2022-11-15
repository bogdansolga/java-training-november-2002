package com.training.d03.s01;

import com.training.d03.s01.model.AbstractFruit;

public interface FruitSqueezer<Fruit extends AbstractFruit> {

    void squeeze(Fruit fruit);
    // public is redundant for interfaces; the visibility is inherited from the interface visibility
}
