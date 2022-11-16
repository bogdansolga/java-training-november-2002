package com.training.d05.s02;

import java.util.StringTokenizer;

public class StringsMain {

    public static void main(String[] args) {
        //simpleStringOperations();
        
        //usingAStringBuilder();

        //usingAStringTokenizer();

        comparingTwoStrings();
    }

    private static void comparingTwoStrings() {
        String first = "something";
        String second = "another thing";
        System.out.println(first == second); // will compare the object (/ memory) references, not the values

        // comparing the Strings values
        System.out.println(first.equals(second));
        System.out.println(first.equalsIgnoreCase(second));
    }

    private static void usingAStringTokenizer() {
        String text = "I. want a! holiday, not just a weekend!";
        StringTokenizer stringTokenizer = new StringTokenizer(text, " ,!.");
        while (stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());
        }
    }

    private static void usingAStringBuilder() {
        StringBuilder builder = new StringBuilder("somewhere, ");
        builder.append("over ")
               .append("the ")
               .append("rainbow");
        String theGeneratedString = builder.toString();
        System.out.println("Generated: " + theGeneratedString);
        if (isNullOrEmpty(theGeneratedString)) {
            System.out.println("it is null or empty");
        }
    }

    private static boolean isNullOrEmpty(String string) {
        String nullReference = null; // this is null
        String empty = ""; // this is not null, just empty

        return string == null || string.isEmpty(); // ""
    }

    private static void simpleStringOperations() {
        String text = "Learning the String class usage"; // the String object is _immutable_ --> new objects will be created
        final String substring = text.substring(5);

        System.out.println(text.contains("String"));
        System.out.println(text.substring(0, 5));

        char[] chars = {'J', 'a', 'v', 'a'};
        String valueFromCharArray = new String(chars);
        System.out.println(valueFromCharArray);
    }
}
