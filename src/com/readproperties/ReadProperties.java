package com.readproperties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	public static void main(String[] args) throws IOException {

File f=new File("./PropertiesFile/Config.properties");

FileInputStream fis=new FileInputStream(f);

Properties prop=new Properties();
prop.load(fis);

System.out.println(prop.getProperty("username"));


		

	}

}
