package com.ConditionalStatements;

import java.util.Scanner;

public class D04IfElseDemo1 {
    public static void main(String[] args) {
        //Accept amount from the user and calculate 10% discount
        // if amount is grater than or equal to 1000 and calculate net amount
        int amount;
        double discount = 0, netAmount;

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Amount: ");
        amount = scn.nextInt();

        if(amount >= 1000){
            discount = amount * 0.10;
        }
        else {
            discount = amount * 0.05;
        }

        netAmount = amount - discount;
        System.out.println("Discount  : " + discount);
        System.out.println("Net Amount: " + netAmount);

    }
}
