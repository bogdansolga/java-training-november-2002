package com.training.d04.s03;

import java.util.Arrays;

public class ArraysMain {

    public static void main(String[] args) {
        Integer[] intValues = new Integer[5];
        //intValues[0] = 10;
        //intValues[3] = 15;

        // for each
        for (Integer intValue : intValues) {
            //System.out.println(intValue);
        }

        // index based iteration
        for (int i = 0; i < intValues.length; i++) {
            intValues[i] = i*3;
            //System.out.println(intValues[i]);
        }

        // o mulțime de elemente, de un anumit tip - Integer, String, Product
        Integer[] initialized = new Integer[]{1, 5, 7, 82, 29, 34};
        System.out.println(initialized.length + ", " + Arrays.toString(initialized));

        final int compare = Arrays.compare(intValues, initialized);
        System.out.println("Compare is " + compare);
    }
}
