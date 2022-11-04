package com.training.d02.s01;

import com.training.model.Cat;

public class CatMain {

    public static void main(String[] args) {
        Cat tom = new Cat();
        tom.setName("Tom");

        Cat beauty = new Cat();
        beauty.setName("Beauty"); //beauty: the object name; .setName - a method from the Cat class

        beauty.makeKittens(tom);
    }
}
