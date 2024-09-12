package com.senayinan.exercises_project;

public class Fibonacci {
    public void printFibonacci(int count) {
        int a = 0, b = 1;
        System.out.print(a + " " + b);

        for (int i = 2; i < count; i++) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
        System.out.println();
    }
}
