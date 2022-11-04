package com.training.d02.s04;

import com.training.model.Fish;

public class ToStringMain {

    public static void main(String[] args) {
        Fish fish = new Fish("Baby Shark");
        System.out.println(fish);

        Fish anotherFish = new Fish("Baby Shark");
        System.out.println(fish.equals(anotherFish));
    }
}
