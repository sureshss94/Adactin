package com.cucu.pro;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.base.Base_Class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "src\\test\\java\\com\\cuumberfile", 
		glue = "com.sd",

		monochrome = true, 
		dryRun = true, 
		publish = true,

		
		//tags = "@Ad1",

		plugin = { 
				"html:Report/Html_Report.html",
				"pretty", 
				"json:Json_Report/Report.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				}

)

public class Test_Runner {

	public static WebDriver driver;

	@BeforeClass
	public static void set_Up() {

		driver = Base_Class.browser_Configuration("chrome");
	}

	@AfterClass
	public static void tear_Down() {

		driver.close();
	}

}
