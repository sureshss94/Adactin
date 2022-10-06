package com.configuration.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class Configuration_Reader {

	public static Properties p;
	public Configuration_Reader() throws IOException {

		File f = new File(
				"C:\\Users\\suresh\\March22_PB\\src\\main\\java\\com\\test\\properties\\Configuration.properties");

		FileInputStream fis = new FileInputStream(f);
		
		p = new Properties();
		
		p.load(fis);
	}
	
	public String get_Config_Url() {

		String value = p.getProperty("url");
		return value;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}