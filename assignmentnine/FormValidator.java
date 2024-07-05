package com.shams.javassignments.assignmentnine;

import java.io.IOException;

public class FormValidator {

    public void validateForm(String username, String password) throws FormValidationException, ArithmeticException, IOException {
        // First, perform form validation
        if (username.isEmpty() || password.isEmpty()) {
            throw new FormValidationException("Username and password cannot be empty");
        }
        
        // Then, perform other operations (e.g., division)
        int result = 10 / 0; // This will throw ArithmeticException
        System.out.println("Result: " + result);
    }
}

