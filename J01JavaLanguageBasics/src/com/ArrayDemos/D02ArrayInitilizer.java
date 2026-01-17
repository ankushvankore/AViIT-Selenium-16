package com.ArrayDemos;

public class D02ArrayInitilizer {
    public static void main(String[] args) {
        int[] marks = new int[]{11, 22, 33, 44, 55, 66, 77, 88, 99};
        //While using array initializer, size need not to be specified

        /*System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);*/

        for(int i = 0; i < marks.length; i++){
            System.out.println(marks[i]);
        }

    }
}
