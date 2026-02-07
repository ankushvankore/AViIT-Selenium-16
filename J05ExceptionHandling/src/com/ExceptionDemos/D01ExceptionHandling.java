package com.ExceptionDemos;

public class D01ExceptionHandling {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int i = 9;

        try {
            System.out.println(arr[i]);
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println(ex);
        }
        catch (ArithmeticException ex){
            System.out.println(ex);
        }
        catch (Exception ex){
            System.out.println(ex);
        }
        finally {
            System.out.println("Finally Block Executed!!!");
        }


        System.out.println("Program ends");
    }
}
