package com.training.d02.s04;

import com.training.model.Fish;

public class EqualsAndHashCodeMain {

    public static void main(String[] args) {
        Fish first = new Fish("Nemo");
        Fish second = new Fish("Dory");
        System.out.println(first.equals(second));

        Fish third = first; // having the same object reference = using the same memory area
        System.out.println(third.equals(first));

        System.out.println(first.hashCode());
    }
}
