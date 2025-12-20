package com.JavaBasics;

import java.util.Scanner;

public class D06CalculateDiscount {
    public static void main(String[] args) {
        //Accept amount from the user and calculate 10% discount and net amount
        int amount;
        double discount, netAmount;

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Amount: ");
        amount = scn.nextInt();

        discount = amount * 0.10;
        netAmount = amount - discount;

        System.out.println("Discount  : " + discount);
        System.out.println("Net Amount: " + netAmount);
    }
}
