package com.shams.javassignments.assignmenteight;

public class NestedTryCatch {

    public static void main(String[] args) {
        String str = null;
        int length = 0;
        int divisor = 0;

        try {
            // Outer try block
            try {
                // Attempting to get the length of a null string 
                System.out.println("Length of string: " + str.length());
            } catch (NullPointerException e) {
                // Handling NullPointerException
                System.out.println("Caught NullPointerException: " + e.getMessage());
            }

            try {
                // Accessing character at index 10 of string
                System.out.println("Character at index 10: " + str.charAt(10));
            } catch (StringIndexOutOfBoundsException e) {
                // Handling StringIndexOutOfBoundsException
                System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
            }

            try {
                // Performing division by zero 
                int result = 10 / divisor;
                System.out.println("Result of division by zero: " + result);
            } catch (ArithmeticException e) {
                // Handling ArithmeticException
                System.out.println("Caught ArithmeticException: " + e.getMessage());
            }

        } catch (Exception e) {
            // Catching any other unexpected exceptions
            System.out.println("Caught unexpected exception: " + e.getMessage());
        }
    }
}
