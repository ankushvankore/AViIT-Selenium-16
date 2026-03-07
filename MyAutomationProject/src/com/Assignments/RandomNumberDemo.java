package com.Assignments;

import java.util.Random;

public class RandomNumberDemo {
    public static void main(String[] args) {
        Random rnd = new Random();
        int i = rnd.nextInt(5); //Will generate any random number in the range of 0 to 4
        System.out.println(i);
    }
}
