package com.filesystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WrittingExcel {

	public static void main(String[] args) throws IOException {
		
		File f=new File("./TestData/abc.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		
		XSSFSheet sheet=workbook.createSheet("TestData");
		
		XSSFRow row=sheet.createRow(0);
		
		XSSFCell cell=row.createCell(0);
		cell.setCellValue("Hello i am writting new excel");
		
		
		FileOutputStream fos=new FileOutputStream(f);
		workbook.write(fos);
		fos.flush();
		
		workbook.close();
		fos.close();
		

	}

}
