package com.Loops;

public class D02ForDemo1 {
    public static void main(String[] args) {
        int i;

        for(i = 1; i <= 10; i++){
            System.out.println(i);
        }

        System.out.println("-------------- Reverse Order ------------");
        for(i = 10; i >= 1; i--)
            System.out.println(i);
    }
}
