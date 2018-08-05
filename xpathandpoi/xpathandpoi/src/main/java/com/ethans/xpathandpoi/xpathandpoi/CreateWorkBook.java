package com.ethans.xpathandpoi.xpathandpoi;
import java.io.*;
import org.apache.poi.xssf.usermodel.*;

public class CreateWorkBook {
   public static void main(String[] args)throws Exception {
      //Create Blank workbook
      XSSFWorkbook workbook = new XSSFWorkbook();
      
      XSSFSheet spreadsheet = workbook.createSheet("Create Work Book");

      //Create file system using specific name
      FileOutputStream out = new FileOutputStream(new File("C:\\Users\\e059884\\Desktop\\poi\\createworkbook.xlsx"));

      //write operation workbook using file out object 
      workbook.write(out);
      out.close();
      System.out.println("createworkbook.xlsx written successfully");
   }
}