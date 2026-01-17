package com.ArrayDemos;

import java.util.Arrays;

public class D03ArraySorting {
    public static void main(String[] args) {
        //int[] number = new int[] {};
        int i, j, temp;
        int[] numbers = {34, 56, 13, 72, 35, 88, 76, 31, 86};
        //Array is first class object in Java

        System.out.println("------------ Before Sorting -------------");


        for(i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + "\t");
        }

        Arrays.sort(numbers);
        /*for(i = 0; i < numbers.length; i++){
            for(j = 0; j < numbers.length - 1; j++){
                if(numbers[j] < numbers[j+1]){
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }*/

        System.out.println("------------ After Sorting ------------------");
        for(i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] + "\t");
    }
}
