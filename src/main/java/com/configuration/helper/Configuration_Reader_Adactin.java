package com.configuration.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader_Adactin {

	public static Properties p;

	public Configuration_Reader_Adactin() throws IOException {

		File f = new File(
				"C:\\Users\\suresh\\Cucumber_Adactinhotel\\src\\main\\java\\com\\test\\properties\\Configuration1.properties");
		FileInputStream fis = new FileInputStream(f);
		
		p = new Properties();
		p.load(fis);
	}
	
	public  String get_Config_Adactin_Url() {
   String property = p.getProperty("url");
   return property;
		
	}

}
