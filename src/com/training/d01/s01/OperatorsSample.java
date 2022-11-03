package com.training.d01.s01;

public class OperatorsSample {

    public static void main(String[] args) {
        int sum = 3 + 4;
        int subtraction = 10 - 5;
        int produce = 3 * 4;
        double module = 20 % 3;

        unaryOperator();

        //equalityRelationalAndConditional();
    }

    private static void equalityRelationalAndConditional() {
        int value = 3;
        int anotherValue = 5;
        boolean theyAreEqual = value == anotherValue; // == -> testing the equality
        boolean valueIsGreaterThanAnotherValue = value > anotherValue;

        boolean conditional = theyAreEqual && valueIsGreaterThanAnotherValue; // && = and
    }

    private static void unaryOperator() {
        boolean isSunnyToday = true;
        boolean isNotSunny = !isSunnyToday; // ! = not

        String useUmbrella = isSunnyToday ? "no" : "yes"; // ternary operator

        int value = 5;
        int valuePlusOne = ++value;
        System.out.println(valuePlusOne + "/" + value);
    }
}
