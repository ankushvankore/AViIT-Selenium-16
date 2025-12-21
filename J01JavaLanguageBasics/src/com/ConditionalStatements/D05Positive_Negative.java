package com.ConditionalStatements;

import java.util.Scanner;

public class D05Positive_Negative {
    public static void main(String[] args) {
        //Accept a number from user and check whether is +ve or -ve
        int no;
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter Number: ");
        no = scn.nextInt();

        if(no > 0){
            System.out.println("This number is +ve");
        }
        else {
            System.out.println("This number is -ve");
        }
    }
}
