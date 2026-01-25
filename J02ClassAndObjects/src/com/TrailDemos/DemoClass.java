package com.TrailDemos;

import com.ClassDemos.*;

public class DemoClass {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.displayData();

        MyDate d1 = new MyDate(24, "Jan", 2026);
        d1.displayDate();
    }
}
