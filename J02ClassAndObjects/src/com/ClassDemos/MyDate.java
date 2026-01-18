package com.ClassDemos;

public class MyDate {
    private int day;
    private String month;
    private int year;

    public MyDate(){
        day = 1;
        month = "Jan";
        year = 2026;
        System.out.println("Plain / Default Constructor Called");
    }

    public MyDate(int d, String m, int y){
        day = d;
        month = m;
        year = y;
        System.out.println("Parameterized Constructor Called");
    }

    public MyDate(int d, String m){
        day = d;
        month = m;
        year = 2000;
        System.out.println("Another Parameterized Constructor Called");
    }

    //Mutator Method / Setter
    public void setDay(int d){
        day = d;
    }

    //Accessor Method / Getter
    public int getDay(){
        return day;
    }

    //Facilitator Method
    public void displayDate(){
        System.out.println("Date: " + day + "-" + month + "-" + year);
    }
}
