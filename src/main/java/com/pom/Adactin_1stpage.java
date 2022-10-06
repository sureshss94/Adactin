package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_1stpage {
	
	public WebDriver driver;
	
	@FindBy(id ="location")
	private WebElement location;
	
	@FindBy(id ="hotels")
	private WebElement hotels;
	
	@FindBy(xpath ="//select[@name='room_type']")
	
	private WebElement roomtype;
	
	@FindBy(xpath ="//select[@name='room_nos']")
	
	private WebElement roomnos;
	
	@FindBy(xpath ="//input[@name='datepick_in']")
	private WebElement datein;
	
	@FindBy(xpath ="//input[@name='datepick_out']")
	private WebElement dateout;
	
	@FindBy(xpath ="//select[@name='adult_room']")
	private WebElement adult;
	
	@FindBy(xpath ="//select[@name='child_room']")
	private WebElement child;
	
	@FindBy(name ="Submit")
	private WebElement submit;
	
	@FindBy(xpath = "//input[@type='radio']")
	private WebElement select;
	@FindBy(id = "continue")
	private WebElement select1;


	public Adactin_1stpage(WebDriver driver2) {
		     this.driver=driver2;
		     PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomnos() {
		return roomnos;
	}

	public WebElement getDatein() {
		return datein;
	}

	public WebElement getDateout() {
		return dateout;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getSelect() {
		return select;
	}

	public WebElement getSelect1() {
		return select1;
	}
	
	
	
	
}
