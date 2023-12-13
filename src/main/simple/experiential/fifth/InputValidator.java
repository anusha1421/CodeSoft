package org.experiential.fifth;
//Create a class named InputValidator with methods for validating user
//input. Implement methods for validating different types of data, such as
//integers, strings, and email addresses.
//import java.util.InputMismatchException;
import java.util.Scanner;

class InputValidator {
    private Scanner scan = new Scanner(System.in);
    private String name = scan.nextLine();
    private int age = scan.nextInt();
    private String address = scan.next();

    void validating() {
        try {
            if (age < 0) {
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("Address: " + address);
                throw new IllegalArgumentException("Invalid age. Age must be a non-negative value.");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}



