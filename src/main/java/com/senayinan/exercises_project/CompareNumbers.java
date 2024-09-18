package com.senayinan.exercises_project;

public class CompareNumbers {
    public int findLargest(int n1, int n2, int n3)  {
        int largest;
        if (n1 >= n2 && n1 >= n3) {
            largest = n1;
        } else if (n2 >= n1 && n2 >= n3) {
            largest = n2;
        } else {
            largest = n3;
        }
        return largest;
    }
    public int findSmallest(int n1, int n2, int n3) {
        int smallest;
        if(n1<=n2 && n1<= n3)   {
            smallest = n1;
        }else if (n2 <= n1 && n2 <= n3) {
            smallest = n2;
        } else {
            smallest = n3;
        }
        return smallest;
    }
    public boolean areEqual(int n1, int n2, int n3) {
        return n1 == n2 && n2 == n3;
    }
}
