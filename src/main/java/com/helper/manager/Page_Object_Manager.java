package com.helper.manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pom.Adactin_1stpage;
import com.pom.Booking_Page;
import com.pom.Login_Page;

public class Page_Object_Manager {
	
	
	public WebDriver driver;
	
	private Adactin_1stpage firstpage;
	
	private Booking_Page booking;
	
	private Login_Page login;
	
	public Page_Object_Manager(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	public Adactin_1stpage get_instance_firstpage() {
	
	if (firstpage==null) {
		firstpage = new Adactin_1stpage(driver);
	}
	return firstpage;

}
	public Booking_Page get_instance_booking() {
		if (booking==null) {
			booking = new Booking_Page(driver);
			
		}
		
		return booking;
		
	}
	
	public Login_Page get_instance_login(){
	if (login==null) {
		login = new Login_Page(driver);
	}
	return login;
	}
	
	
}