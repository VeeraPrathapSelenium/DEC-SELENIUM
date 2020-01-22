package com.excelplugin;

import java.io.IOException;

public class TestingExcel {

	public static void main(String[] args) throws IOException {
		ExcelParser parser=new ExcelParser();		
		parser.getData("TestData", "Tc_04", 1, "Month");
		parser.getData("TestData", "Tc_03", 1, "FirstName");

	}

}
