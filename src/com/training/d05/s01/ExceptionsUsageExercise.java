package com.training.d05.s01;

public class ExceptionsUsageExercise {

    public static void main(String[] args) {
        usingCheckedExceptions();

        usingUncheckedExceptions();
    }

    private static void usingCheckedExceptions() {
        // invoke a method which throws a checked exception - Date parsing, FileReader creation, ...
        // handle that exception:
        //  1. in a try-catch block
        //  2. add the 'throws' detail to the method, handle it in the main method
    }

    private static void usingUncheckedExceptions() {
        // create a fruits basket, add some fruits to it
        // simulate the obtaining of a fruit from that basket, throw an unchecked exception if it is not found
        //  the NotFoundException, if you want
    }
}
