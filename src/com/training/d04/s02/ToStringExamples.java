package com.training.d04.s02;

import com.training.d03.s01.model.Apple;
import com.training.d03.s01.model.Banana;

public class ToStringExamples {

    public static void main(String[] args) {
        Apple theGreenApple = new Apple();
        theGreenApple.setColor("Green");
        theGreenApple.setTaste("Mildly sweet");

        System.out.println("The apple: " + theGreenApple);
        System.out.println("The apple: " + theGreenApple.toString());

        System.out.println("A banana without toString looks like: " + new Banana().toString());
    }
}
