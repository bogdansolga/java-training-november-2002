package com.training.d04.s02;

import com.training.d03.s01.model.Apple;
import com.training.d03.s01.model.Banana;

public class FruitProcessorMain {

    public static void main(String[] args) {
        AppleProcessor appleProcessor = new AppleProcessor();
        Apple theGreenApple = new Apple();
        theGreenApple.setColor("Green");
        theGreenApple.setTaste("Mildly sweet");
        appleProcessor.process(theGreenApple);

        BananaProcessor bananaProcessor = new BananaProcessor();
        bananaProcessor.process(new Banana());
    }
}
