package com.Loops;

import java.util.Scanner;

public class D04PrintTable {
    public static void main(String[] args) {
        //Accept a number from user and print its multiplication table
        //5 10  15  20  25
        int no, i;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Number: ");
        no = scn.nextInt();

        for(i = 1; i <= 10; i++){
            System.out.println(no * i);
        }
    }
}
