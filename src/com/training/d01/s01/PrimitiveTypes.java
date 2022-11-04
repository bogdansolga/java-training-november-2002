// all the package names are written in lower case letters and are separated by .
package com.training.d01.s01;

// all the Java class names begin with an upper case letter and continue with the words in camelCase
public class PrimitiveTypes {

    // all the Java methods and variables are named in camelCase
    public static void main(String[] args) {
        int today = 3; // data-type variable-name = value
        today = 6;

                                                                               // new = creating an object
        Integer todayAsClass = new Integer(3); // data-type variable-name = new data-type
        Integer todayAsClassAsValue = 3;

        int month = 1; // default value: 0
        System.out.println(month);
        Integer monthAsClass; // default value: null (not initialized)

        System.out.println("Today is " + todayAsClass);
        today = 25;
    }
}

// psvm - shortcut for 'public static void main'
// sout - shortcut for 'System.out.println'
