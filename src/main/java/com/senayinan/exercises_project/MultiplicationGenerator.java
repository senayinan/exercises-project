package com.senayinan.exercises_project;

public class MultiplicationGenerator {
    public void generateMultiplication (int num, int range)    {
        for (int i = 1; i<=range ; i++) {
            System.out.println(num + "x" + i + "=" + (num * i));
        }
    }
}
