package com.training.d04.s02;

import com.training.d03.s01.model.Apple;
import com.training.d03.s01.model.Banana;

public class FruitProcessorRefactored {

    public static void main(String[] args) {
        Apple theGreenApple = createApple();

        AppleProcessor appleProcessor = new AppleProcessor();
        appleProcessor.process(theGreenApple);
        appleProcessor.process(createApple("Red", "sweet"));

        BananaProcessor bananaProcessor = new BananaProcessor();
        bananaProcessor.process(new Banana());
    }

    // the 'createApple' method is _overloaded_ --> there are two methods with the same name, but with different arguments
    private static Apple createApple() {
        Apple theGreenApple = new Apple();
        theGreenApple.setColor("Green");
        theGreenApple.setTaste("Mildly sweet");
        return theGreenApple;
    }

    private static Apple createApple(String color, String taste) {
        Apple theGreenApple = new Apple();
        theGreenApple.setColor(color);
        theGreenApple.setTaste(taste);
        return theGreenApple;
    }
}
