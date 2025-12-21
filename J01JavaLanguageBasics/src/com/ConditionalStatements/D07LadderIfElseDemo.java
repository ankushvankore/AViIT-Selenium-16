package com.ConditionalStatements;

import java.util.Scanner;

public class D07LadderIfElseDemo {
    public static void main(String[] args) {
        int amount;
        double discount = 0, netAmount;

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Amount: ");
        amount = scn.nextInt();

        if(amount < 1000){
            discount = amount * 0.02;
        }
        else if(amount < 3000){
            discount = amount * 0.05;
        }
        else if(amount < 5000){
            discount = amount * 0.10;
        }
        else {
            discount = amount * 0.15;
        }

        netAmount = amount - discount;
        System.out.println("Discount  : " + discount);
        System.out.println("Net Amount: " + netAmount);
    }
}
