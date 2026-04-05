package com.TestNGDemos;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class D13CreateFriendsData {
    File file;
    FileOutputStream fos;
    XSSFWorkbook wb;
    XSSFSheet sheet;
    XSSFRow row;
    XSSFCell cell;

    @Test
    public void writeData(){
        row = sheet.createRow(0);
        cell = row.createCell(0);
        cell.setCellValue("Pravin");

        //row = sheet.createRow(0);
        cell = row.createCell(1);
        cell.setCellValue("Ahire");

        sheet.createRow(1).createCell(0).setCellValue("Amit");
        sheet.getRow(1).createCell(1).setCellValue("Tiwari");
    }

    @BeforeTest
    public void setup() throws FileNotFoundException {
        file = new File("FriendsData.xlsx");
        fos = new FileOutputStream(file);
        wb = new XSSFWorkbook();
        sheet = wb.createSheet("My Sheet");
    }

    @AfterTest
    public void saveData() throws IOException {
        wb.write(fos);
        wb.close();
        fos.close();
    }
}
