package com.senayinan.exercises_project;

public class NumberChecker {
    public void checkNumber(int number) {
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
