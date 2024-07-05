package com.shams.javassignments.assignmentnine;

import java.io.IOException;

public class ThrowsDemo {

    public static void main(String[] args) {
        FormValidator formValidator = new FormValidator();
        
        try {
            //formValidator.validateForm("username", "password"); this line will not give form error 
            formValidator.validateForm("", "password"); //username is empty so it gives error
        } catch (FormValidationException e) {
            System.out.println("Form validation error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}

