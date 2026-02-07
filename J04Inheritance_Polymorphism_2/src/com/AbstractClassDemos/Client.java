package com.AbstractClassDemos;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        //Shape s1 = new Shape();
        Shape s1 = new Circle(5);
        s1.calculateArea();

        Circle c1 = new Circle(4);
        c1.calculateArea();

        Rectangle r1 = new Rectangle(4, 5);
        r1.calculateArea();
        r1.print();

        //PrintInfo p1 = new PrintInfo();
        PrintInfo p1 = new Circle(5);
        p1.print();

        c1.trial();
        r1.trial();
    }
}
