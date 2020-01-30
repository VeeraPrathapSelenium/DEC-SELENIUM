package com.readproperties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	public Properties property;

	public Properties getConfigFile() throws IOException {
		System.out.println("Loading config file");
		File f = new File("./Configurations/Config.properties");

		FileInputStream fis = new FileInputStream(f);

		property = new Properties();
		property.load(fis);

		System.out.println("Config file loaded sucessfully");
		return property;

	}

}
