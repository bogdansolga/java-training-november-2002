package com.training.d01.s03;

import java.time.LocalDate;

public class ControlStructures {

    public static void main(String[] args) {
        //ifElse();
        //nestedIfs();

        //switchExample();

        //indexBasedFor();
        //itemBasedFor();

        // Ctrl + Alt + M --> Extract method
        // Shift + F6 --> Rename method
        // methodWithAReturnTypeRenamed();

        saveProductInDatabase(); //() --> calling/invoking a method without parameters
        saveProductInDatabase("something");     //invoking a method with a parameter

        // invoking a method, with some concrete values
        sumOfTwoNumbers(10, 20);
        sumOfTwoNumbers(5, 7);
    }

    // defining / implementing a method, with its parameters and their names
    private static void sumOfTwoNumbers(int first, int second) {
        int sum = first + second;
        System.out.println("The sum of " + first + " and " + second + " is " + sum);
    }

    private static void saveProductInDatabase() {
        String product = createProduct();
        saveProductInDatabase(product);
        displayConfirmationMessage();
    }

    private static void displayConfirmationMessage() {

    }

    private static String createProduct() {
        return null;
    }

    private static void saveProductInDatabase(String product) {

    }

    private static void methodWithAReturnTypeRenamed() {
        LocalDate today = getCurrentDay(); // 'today' is a variable
        System.out.println("Today is " + today);
    }

    private static LocalDate getCurrentDay() {
        // please (x25) DO NOT RETURN null
        return LocalDate.now();
    }

    private static void itemBasedFor() {
        String[] weekDays = {"Monday", "Tuesday"};
        for (String weekDay : weekDays) {
            System.out.println(weekDay.toUpperCase());
        }
    }

    private static void indexBasedFor() {
        // display the first 10 numbers
        for (int i = 10; i > 0; i--) {
            if (i == 5) { // or any other condition
                break;      // will stop the looping
                //continue;   // will skip the current execution
            }
            System.out.println(i);
        }
    }

    private static void switchExample() {
        String today = "Thursday";
        switch (today) {
            case "Wednesday":
                System.out.println("It is Wednesday");
                break;
                // going one indentation level to the left: Shift + Tab

            case "Thursday":
                System.out.println("Almost weekend!");
                break;

            default:
                System.out.println("Unknown day " + today);
                break;
        }
    }

    // please avoid them --> think of the violent psychopath :)
    private static void nestedIfs() {
        if (true) {
            boolean sunny = true;
            anotherCondition(sunny);
        }
    }

    private static void anotherCondition(boolean sunny) {
        if (sunny) {
            System.out.println("It is sunny");
        }
    }

    private static void ifElse() {
        boolean isSunnyToday = true;
        if (isSunnyToday) {
            System.out.println("The sun is shining!");
        } else {
            System.out.println("Not so sunny today");
        }

        if (isSunnyToday) System.out.println("Without braces");
    }
}
