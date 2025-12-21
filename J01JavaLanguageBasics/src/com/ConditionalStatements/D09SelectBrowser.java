package com.ConditionalStatements;

public class D09SelectBrowser {
    public static void main(String[] args) {
        String browser = "Opera";

        switch (browser) {
            case "Chrome":
                System.out.println("Testing on Chrome");
                break;
            case "Edge":
                System.out.println("Testing on Edge");
                break;
            case "Firefox":
                System.out.println("Testing on FF");
                break;
            case "Safari":
                System.out.println("Testing on Safari");
                break;
            default:
                System.out.println("Wrong browser");
        }
    }
}
