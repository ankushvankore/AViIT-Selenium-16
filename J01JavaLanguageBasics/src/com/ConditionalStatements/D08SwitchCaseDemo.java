package com.ConditionalStatements;

import java.util.Scanner;

public class D08SwitchCaseDemo {
    public static void main(String[] args) {
        int day;
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter Day: ");
        day = scn.nextInt();

        /*if(day == 1){
            System.out.println("Sunday");
        }
        else if(day == 2){
            System.out.println("Monday");
        }*/

        switch (day){
            case 3:
                System.out.println("Tuesday!!!");
                break;
            case 1:
                System.out.println("Sunday!!!");
                break;
            case 2:
                System.out.println("Monday!!!");
                break;
            case 4:
               System.out.println("Wednesday!!!");
                break;
            case 5:
                System.out.println("Thursday!!!");
                break;
            case 6:
                System.out.println("Friday!!!");
                break;
            case 7:
                System.out.println("Saturday!!!");
                break;
            default:
                System.out.println("Wrong Input");
        }
    }
}
