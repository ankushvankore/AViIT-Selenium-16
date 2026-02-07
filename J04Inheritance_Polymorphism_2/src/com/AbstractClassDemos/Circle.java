package com.AbstractClassDemos;

public class Circle extends Shape implements PrintInfo{
    private int rd;

    public Circle(int rd) {
        this.rd = rd;
    }

    @Override
    public void calculateArea() {
        double area = 3.142 * rd * rd;
        System.out.println("Area of Circle: " + area);
    }

    @Override
    public void print() {
        System.out.println("This is Circle Class");
    }
}
