package com.FunctionDemos;

public class D06PrintNumbers {
    //Accept 2 numbers and display all the numbers in this range including both

    public static int printNumberFromRange(int n1, int n2){
        int cnt = 0;
        for(int i = n1; i <= n2; i++) {
            System.out.println(i);
            cnt++;
        }

        return cnt;
    }
    public static void main(String[] args) {
        int n1 = 16, n2 = 20;

        int nos = printNumberFromRange(n1, n2);
        System.out.println("Total nos printed: " + nos);
    }
}
