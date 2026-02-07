package com.ExceptionDemos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class D02CheckedException {
    public static void main(String[] args) throws IOException {
        //File file = new File("TrialFile.txt");
        //FileInputStream fis = new FileInputStream(file);

        throw new NullPointerException();
    }
}
