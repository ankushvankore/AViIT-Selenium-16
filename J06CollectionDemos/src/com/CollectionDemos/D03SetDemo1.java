package com.CollectionDemos;

import java.util.HashSet;
import java.util.Set;

public class D03SetDemo1 {
    public static void main(String[] args) {
        Set<String>students = new HashSet<>();

        students.add("Kamini");
        students.add("Amit");
        students.add("Pravin");
        students.add("Chetan");
        students.add("Amit");

        System.out.println(students);

        for(String st : students)
            System.out.println(st);

        Object[] arr = students.toArray();

        System.out.println(arr[0].toString());
        System.out.println(arr[1].toString());
        System.out.println(arr[2].toString());
        System.out.println(arr[3].toString());
        System.out.println(arr[4].toString());
    }
}
