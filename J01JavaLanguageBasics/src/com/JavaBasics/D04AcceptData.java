package com.JavaBasics;

import java.util.Scanner;

public class D04AcceptData {
    public static void main(String[]args){
        int no;
        double avg;
        String name;

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter Number : ");
        no = scn.nextInt();
        System.out.print("Enter Average: ");
        avg = scn.nextDouble();
        System.out.print("Enter Name   : ");
        name = scn.next();

        System.out.println("Number : " + no);
        System.out.println("Average: " + avg);
        System.out.println("Name   : " + name);
    }
}
