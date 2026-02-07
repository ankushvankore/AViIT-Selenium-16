package com.AbstractClassDemos;

public class Rectangle extends Shape implements PrintInfo{
    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void calculateArea() {
        int area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    @Override
    public void print() {
        System.out.println("This is Rectangle Class");
    }
}
