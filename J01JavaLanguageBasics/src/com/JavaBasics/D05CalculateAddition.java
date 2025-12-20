package com.JavaBasics;

import java.util.Scanner;

public class D05CalculateAddition {
    public static void main(String[] args) {
        int no1, no2, sum;

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter First No: ");
        no1 = scn.nextInt();
        System.out.println("Enter Second No: ");
        no2 = scn.nextInt();

        sum = no1 + no2;

        System.out.println("Addition is: " + sum);

    }
}
