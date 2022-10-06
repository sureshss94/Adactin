package com.configuration.helper;

import java.io.IOException;

public class File_Reader_Manager {
	
	
	private  File_Reader_Manager() {
		
		
	}
	public  static File_Reader_Manager get_Instance_FRM() {

		File_Reader_Manager frm = new File_Reader_Manager();
		return frm;
		
	}

	
	public Configuration_Reader get_Instance_CR() throws IOException {

		Configuration_Reader reader = new Configuration_Reader();
		return reader;
		
	}
	
	public  Configuration_Reader_Adactin get_Instance_Adaction() throws IOException {
		Configuration_Reader_Adactin adactin = new Configuration_Reader_Adactin();
		
		return adactin;
		
	}
	
	
}
