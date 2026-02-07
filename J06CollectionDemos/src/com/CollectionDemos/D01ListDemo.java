package com.CollectionDemos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class D01ListDemo {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("Mango");
        fruits.add("Grapes");
        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Guawa");
        fruits.add("Apple");

        System.out.println("Total no of fruits: " + fruits.size());

        //System.out.println(fruits.get(3));

        //for(int i = 0; i < fruits.size(); i++)
          //  System.out.println(fruits.get(i));

        for(String f : fruits)
            System.out.println(f);

        Collections.sort(fruits);
        System.out.println(fruits);
        System.out.println("----------- After Sorting --------------");

        for(String f : fruits)
            System.out.println(f);

        //fruits.remove(2);
        fruits.remove("Grapes");

        System.out.println(fruits.contains("Grapes"));
    }
}
