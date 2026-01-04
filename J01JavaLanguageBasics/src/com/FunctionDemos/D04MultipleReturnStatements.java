package com.FunctionDemos;

public class D04MultipleReturnStatements {
    public static int findMax(int no1, int no2){
        if(no1 > no2)
            return no1;
        else
            return no2;
    }

    public static void main(String[] args) {
        int n1 = 55, n2 = 444;
        int max = findMax(n1, n2);

        System.out.println("Max: " + max);
    }
}
