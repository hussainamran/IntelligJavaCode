package com.syntax.class30;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelDemo7 {
    public static void main(String[] args) throws IOException {

        //path where we want to create the file
        String path="C:\\Users\\Amran\\Desktop\\New folder\\Test.xlsx";
//creating the object of xssFWorkbook
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook();
//creating new sheet inside the file
        Sheet sheet=xssfWorkbook.createSheet("Sheet1");
//creating new rows inside the sheet
        Row row=sheet.createRow(0);
//creating new cells inside row 0
        Cell cell=row.createCell(0);
//setting the data to that newly created cell
        cell.setCellValue("Test");
//creating the outputstream

        FileOutputStream fileInputStream=new FileOutputStream(path);
 //staring the data to that excel file
        xssfWorkbook.write(fileInputStream);
    }
}
