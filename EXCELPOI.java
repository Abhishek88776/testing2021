package seleium_java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class EXCELPOI {
public static void main(String args[]) throws Exception{
	FileInputStream  fis= new
	FileInputStream("‪C:\\Users\\Abhishek\\Downloads\\WriteData.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(fis);
	XSSFSheet sheet=workbook.getSheet("test");
	System.out.println(sheet.getSheetName());
	System.out.println(sheet.getLastRowNum());
	System.out.println("Before updating cell data"+sheet.getRow(2).getCell(1));
	
	
			
	 
}

}
