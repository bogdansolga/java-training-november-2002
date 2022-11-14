package com.training.d03.s01;

import com.training.d03.s01.model.AbstractFruit;
import com.training.d03.s01.model.Apple;
import com.training.d03.s01.model.Banana;
import com.training.d03.s01.model.Pomegranate;

import java.util.ArrayList;
import java.util.List;

public class FruitsMain {

    public static void main(String[] args) {
        //AbstractFruit abstractFruit = new AbstractFruit(); // cannot instantiate abstract classes
        Banana greenBanana = new Banana();
        Pomegranate redPomegranate = new Pomegranate();

        System.out.println("We can make juice from bananas: " +
                greenBanana.canMakeJuiceFromIt());

        List<AbstractFruit> fruitsBasket = new ArrayList<>();
        fruitsBasket.add(greenBanana);
        fruitsBasket.add(redPomegranate);
        fruitsBasket.add(new Apple());

        for (AbstractFruit abstractFruit : fruitsBasket) {
            System.out.println("Can make juice from a " + abstractFruit.getName() + ": " +
                    abstractFruit.canMakeJuiceFromIt());
        }
    }
}
