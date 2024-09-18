package com.senayinan.exercises_project;

public class GradeCalculator {
    public String calculateGrade(int score) {
        double gr = 0;
        if(score>=90)   {
            return "A";
        } else if (score>=80)   {
            return "B";
        }   else if (score>=70) {
            return "C";
        }   else if (score>=60) {
            return "D";
        }   else {
            return "F";
        }
    }
}
