package com.StringDemos;

import java.util.HashSet;
import java.util.Set;

public class D01StringDemos {
    public static void main(String[] args) {
        String str = "Welcome to Java";

        System.out.println("Length of String: " + str.length());
        System.out.println("Character at 8th Position: " + str.charAt(8));
        System.out.println("Index of J: " + str.indexOf('J'));
        System.out.println("Index of e: " + str.indexOf('e'));

        System.out.println("Upper Case: " + str.toUpperCase());
        System.out.println("Lower Case: " + str.toLowerCase());

        str = str.toUpperCase();

        System.out.println(str);

        String str2 = "Welcome to Java";

        if(str.equals(str2))
            System.out.println("Both are equal");
        else
            System.out.println("Both are not equal");

        if(str.equalsIgnoreCase(str2))
            System.out.println("Both are equal considering the case");
        else
            System.out.println("Both are not equal even considering the case");

        String expMessage = "Invalid Username/Password";
        if(expMessage.contains("Invalid"))
            System.out.println("Text case pass");
        else
            System.out.println("Test Case fail");

        for (int i = 0; i < expMessage.length(); i++) {
            for (int j = i + 1; j < expMessage.length(); j++) {
                if (expMessage.charAt(i) == expMessage.charAt(j)) {
                    char c = expMessage.charAt(i);
                    System.out.println(c);
                    expMessage.replace(c, (char) expMessage.indexOf(c));
                    break;
                }
            }
        }
        System.out.println(expMessage);

        expMessage = expMessage.replace("a", "A");
        System.out.println(expMessage);

        expMessage = expMessage.replace("A", "");
        System.out.println(expMessage);

        String revString = "";
        for(int i = expMessage.length() - 1; i>= 0; i--){
            revString += expMessage.charAt(i);
        }
        System.out.println(revString);
        str = "programming";
        Set<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (seen.contains(ch)) {
                result.append(i);   // replace duplicate with index
            } else {
                seen.add(ch);
                result.append(ch); // keep first occurrence
            }
        }

        System.out.println(result.toString());

    }
}
