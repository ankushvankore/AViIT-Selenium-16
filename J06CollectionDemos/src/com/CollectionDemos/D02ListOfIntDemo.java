package com.CollectionDemos;

import java.util.ArrayList;
import java.util.List;

public class D02ListOfIntDemo {
    public static void main(String[] args) {
        //Create List of int and add any 5 numbers in the list and display it
        List<Integer> nos = new ArrayList<>();
        nos.add(10);
        nos.add(20);
        nos.add(30);

        for(int n : nos)
            System.out.println(n);
    }
}
