package com.FunctionDemos;

public class D01SimpleFunction {

    public static void sayHello(){
        System.out.println("Welcome to Function!!!");
    }

    public void trial(){
        System.out.println("This is trial method");
    }

    public static void main(String[] args) {
        sayHello();
        sayHello();

        D01SimpleFunction s1 = new D01SimpleFunction();
        s1.trial();
    }
}
