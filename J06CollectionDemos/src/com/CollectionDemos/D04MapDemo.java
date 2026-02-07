package com.CollectionDemos;

import java.util.HashMap;
import java.util.Map;

public class D04MapDemo {
    public static void main(String[] args) {
        //Map<> represents Key-Value pair
        //Each element has to entries 1 is key and 2nd in value
        //Key cannot be duplicate but value can be

        Map<Integer, String>employees = new HashMap<>();
        employees.put(101, "Amit");
        employees.put(102, "Pravin");
        employees.put(103, "Kamini");
        employees.put(104, "Chetan");
        //employees.put(102, "Ankush");
        employees.put(105, "Chetan");

        System.out.println(employees);

        if(employees.containsKey(101))
            System.out.println("Employee id already present");

        for(Map.Entry<Integer, String> e : employees.entrySet())
            System.out.println("Employee Id: " + e.getKey() + ": Employee Name: " + e.getValue());
    }
}
