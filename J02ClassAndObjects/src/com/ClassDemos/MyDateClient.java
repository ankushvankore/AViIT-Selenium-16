package com.ClassDemos;

public class MyDateClient {
    public static void main(String[] args) {
        MyDate d1 = new MyDate();
        d1.setDay(18);
        d1.displayDate();
        System.out.println("Day: " + d1.getDay());
        System.out.println("---------------------------");
        MyDate d2 = new MyDate();
        d2.displayDate();
        System.out.println("---------------------------");
        MyDate d3 = new MyDate(14, "Feb", 1986);
        d3.displayDate();
        System.out.println("---------------------------");
        MyDate d4 = new MyDate(14, "Dec", 1982);
        d4.displayDate();
        System.out.println("---------------------------");
        MyDate d5 = new MyDate(17, "Sept");
        d5.displayDate();
        System.out.println("---------------------------");
        MyDate d6 = new MyDate(30, "Sept", 1989);
        d6.displayDate();
        System.out.println("---------------------------");
        MyDate d7 = new MyDate(29, "Jan", 1979);
        d7.displayDate();

        MyDate d8 = new MyDate(10, "Feb", 2004);
    }
}
