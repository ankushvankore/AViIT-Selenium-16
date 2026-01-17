package com.FunctionDemos;

public class D03ReturningValueFromFunction {
    public static double calculateAreaOfCircle(int r){
        //double area = 3.142 * r * r;

        //return area;
        return 3.142 * r * r;
    }

    public static void main(String[] args) {
        double area = calculateAreaOfCircle(5);
        System.out.println("Area of Circle: " + area);

        System.out.println("Area of Circle: " + calculateAreaOfCircle(4));
    }

    /*
    Points to be noted about return statement
    1. return statement terminates the function
    2. return statement returns a SINGLE value to calling function
    3. but you may have multiple return statements in the function
    4. You could not write anything after return
     */
}
