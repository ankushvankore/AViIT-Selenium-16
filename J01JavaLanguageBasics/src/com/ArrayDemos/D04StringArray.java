package com.ArrayDemos;

import java.util.Arrays;

public class D04StringArray {
    public static void main(String[] args) {
        String[] students = {"Kamini", "Pravin", "Amit", "Chetan"};

        for(int i = 0; i < students.length; i++)
            System.out.print(students[i] + "\t");

        Arrays.sort(students);

        System.out.println("\nAfter Sorting");

        for(String st : students)
            System.out.println(st);

        /*
        Few points to be noted about for-each loop
        1. This is forward only loop
        2. This read only loop
         */

        int[]  numbers = {10, 20, 30, 40};
        for(int n : numbers){
            n++;
            System.out.print(n + "\t");
        }
        System.out.println();
        for(int n : numbers){
            System.out.print(n + "\t");
        }
    }
}
