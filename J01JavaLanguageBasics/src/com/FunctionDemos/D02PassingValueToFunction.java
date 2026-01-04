package com.FunctionDemos;

public class D02PassingValueToFunction {
    public static void calculateAddition(int no1, int no2){
        int add = no1 + no2;
        System.out.println("Addition: " + add);
    }

    public static void main(String[] args) {
        calculateAddition(20, 30);
        int no1 = 19, no2 = 78;
        calculateAddition(no1, no2);
    }
}
