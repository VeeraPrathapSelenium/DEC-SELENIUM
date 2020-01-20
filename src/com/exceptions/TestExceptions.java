package com.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestExceptions {

	public static void main(String[] args) throws FileNotFoundException {
		File f=new File("");
		
		FileInputStream fis=new FileInputStream(f);
		
	}
}
