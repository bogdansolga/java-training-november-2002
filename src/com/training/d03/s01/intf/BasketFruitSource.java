package com.training.d03.s01.intf;

import com.training.d03.s01.model.AbstractFruit;
import com.training.d03.s01.model.Apple;

public class BasketFruitSource implements AbstractFruitSource {

    @Override
    public AbstractFruit getFruitByName(String name) {
        return new Apple();
    }
}
