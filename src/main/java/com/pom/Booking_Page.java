package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Page {
	public WebDriver driver;
	
	@FindBy(xpath="//input[@name='first_name']")
	private WebElement fname ;
	
	@FindBy(xpath="//input[@name='last_name']")
	private WebElement lname ;
	
	@FindBy(name="address")
	private WebElement address ;
	
	@FindBy(xpath="//input[@name='cc_num']")
	private WebElement cardnumber ;
	
	@FindBy(xpath="//select[@name='cc_type']")
	private WebElement cardtype ;
	
	@FindBy(xpath="//select[@name='cc_exp_month']")
	private WebElement expmonth ;
	
	@FindBy(xpath="//select[@name='cc_exp_year']")
	private WebElement expyear ;
	
	@FindBy(xpath="//input[@name='cc_cvv']")
	private WebElement cvvnum ;
	
	@FindBy(xpath="//input[@name='book_now']")
	private WebElement booknow ;
	
	@FindBy(id="logout")
	private WebElement logout ;

	public Booking_Page(WebDriver driver2) {
		this.driver  = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardnumber() {
		return cardnumber;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getExpmonth() {
		return expmonth;
	}

	public WebElement getExpyear() {
		return expyear;
	}

	public WebElement getCvvnum() {
		return cvvnum;
	}

	public WebElement getBooknow() {
		return booknow;
	}

	public WebElement getLogout() {
		return logout;
	}
	
	
	
	
	
	
	
	
	
	

}
