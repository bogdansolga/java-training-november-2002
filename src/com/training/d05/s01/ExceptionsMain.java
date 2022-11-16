package com.training.d05.s01;

import com.training.d03.s01.model.Apple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionsMain {

    public static void main(String[] args) throws ParseException {
        //nullPointerExceptionExample();

        //nullPointerExceptionWithTryCatchExample();

        //checkedExceptionExample();

        //tryWithoutCatch(); // do NOT use this

        // a clean coding recommendation - try (as much as possible) to wrap the exception handling in a method
        //  - encapsulating the try-catch-finally handling in a dedicated place (method) --> hiding the ugliness
        //  - reduce the code indentation with at least one level --> reduce the needed cognitive effort

        // another clean coding recommendation - short-circuiting based processing
        //shortCircuitingProcessingExample();

        //tryWithResourcesExample();
        tryWithResourcesExampleRefactored();
    }

    private static void tryWithResourcesExample() {
        File file = null;
        try {
            file = new File("using-try-with-resources.txt");
            if (!file.exists()) {
                throw new FileNotFoundException("The file was not found");
            }
        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
            throw new IllegalArgumentException(ex.getMessage());
        }

        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private static void tryWithResourcesExampleRefactored() {
        File file = getFileOrThrow();
        displayFileContent(file);
    }

    private static File getFileOrThrow() {
        try {
            File file = new File("using-try-with-resources.txt");
            if (!file.exists()) {
                throw new FileNotFoundException("The file was not found");
            }
            return file;
        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
            throw new IllegalArgumentException(ex.getMessage());
        }
    }

    private static void displayFileContent(File file) {
        try (FileReader fr = new FileReader(file); // try-with-resources
             BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private static void shortCircuitingProcessingExample() {
        String appleColor = "green";
        Apple apple = getAppleOrThrow(appleColor);
        System.out.println("The obtained apple is " + apple.getColor());
    }

    private static Apple getAppleOrThrow(String appleColor) {
        if (System.currentTimeMillis() % 2 == 0) {
            return new Apple();
        }

        throw new RuntimeException("Not found");
    }

    private static void tryWithoutCatch() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date parse = dateFormat.parse("2022-11-16");
        } finally {
            System.out.println("Something to be done regardless of the exception throwing or not");
        }
    }

    private static void checkedExceptionExample() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        //final Date parse = dateFormat.parse("2022-11-16"); // two alternatives for handling checked exceptions

        // 1. using a try/catch block
        /*
        try {
            Date parse = dateFormat.parse("2022-11-16");
        } catch (ParseException e) {
            System.err.println(e.getMessage());
        }
        */

        // 2. throwing the exception from the method
        Date parsedDate = dateFormat.parse("2022-11-16");
        System.out.println("The parsed date is " + parsedDate);

        // two data channels are automatically created in any program that writes data
        //  an output channel - for normal execution        --> System.out
        //  an error channel  - for erroneous execution     --> System.err
    }

    private static void nullPointerExceptionWithTryCatchExample() {
        try {
            String name = null;
            System.out.println(name.length());
        } catch (NullPointerException ex) {
            System.err.println("An exception occurred - " + ex.getMessage());
            ex.printStackTrace();
            throw new IllegalArgumentException("A new exception type being thrown");
        } catch (Exception ex) { // Pokemon exception - di tăti
            // another handling
        } finally {
            // do something at the end of the processing
        }
    }

    private static void nullPointerExceptionExample() {
        String name = null; // a not initialized variable --> there is no assignment for it
        System.out.println(name.length()); // an attempt to access a property from that object
    }
}
