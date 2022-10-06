package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Extracopy {

	public static WebDriver driver;

	public static WebDriver browser_Configuration(String type) {

		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver1.exe");

			driver = new ChromeDriver();

		}

		else if (type.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");

			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();

		return driver;

	}

	public static void clickonElement(String type, WebElement element) {
		if (type.equalsIgnoreCase("click")) {
			element.click();
		} else if (type.equalsIgnoreCase("clear")) {
			element.clear();

		}

	}

	public static void inputValueElement(WebElement element, int index,int index1,int index2) throws IOException {
		
		File  f = new File("C:\\Users\\suresh\\March22_PB\\Test case.xlsx");
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet s = wb.getSheetAt(index);
		
		Row r = s.getRow(index1);
		
		Cell c = r.getCell(index2);
		CellType type = c.getCellType();
		if (type.equals(CellType.STRING)) {
			String stringCellValue = c.getStringCellValue();
			element.sendKeys(stringCellValue);
			wb.close();
		} else if (type.equals(CellType.NUMERIC)){
			double cellValue = c.getNumericCellValue();
			int v = (int) cellValue;
			String value = Integer.toString(v);
			element.sendKeys(value);
			wb.close();

		}
		
		

		

	}

	public static void Driver_operations(String type) {
		if (type.equalsIgnoreCase("close")) {
			driver.close();

		} else if (type.equalsIgnoreCase("quit")) {
			driver.quit();
		} else if (type.equalsIgnoreCase("forward")) {
			driver.navigate().forward();
		} else if (type.equalsIgnoreCase("back")) {
			driver.navigate().back();
		} else if (type.equalsIgnoreCase("refresh")) {
			driver.navigate().refresh();
		}

	}

	public static void getUrl(String url) {

		driver.get(url);
	}

	public static void dropdown(String type, WebElement element, String data) {

		try {
			Select s = new Select(element);

			if (type.equalsIgnoreCase("byvalue")) {
				s.selectByValue(data);

			} else if (type.equalsIgnoreCase("bytext")) {
				s.selectByVisibleText(data);

			} else if (type.equalsIgnoreCase("byindex")) {
				int index = Integer.parseInt(data);
				s.selectByIndex(index);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void waitbrowser(String type, int sec) throws Exception {
		if (type.equalsIgnoreCase("wait")) {
			driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
		} else if (type.equalsIgnoreCase("longwait")) {
			Thread.sleep(sec);
		}

	}

	public static void TakesScreenshot(String path) throws Exception {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File scr = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		FileUtils.copyFile(scr, dest);
		;

	}

	public static void Actionclass(String type, WebElement element) {

		try {
			Actions ac = new Actions(driver);
			if (type.equalsIgnoreCase("moveto")) {

				ac.moveToElement(element).build().perform();

			} else if (type.equalsIgnoreCase("clickon")) {
				ac.click(element).build().perform();
			} else if (type.equalsIgnoreCase("rightclick")) {
				ac.contextClick(element).build().perform();

			} else if (type.equalsIgnoreCase("doubleclick")) {
				ac.doubleClick(element).build().perform();

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void frameswitchTo(String type, WebElement element) {

		if (type.contentEquals("singleframe")) {
			driver.switchTo().frame(element);

		} else if (type.equalsIgnoreCase("defaultcontent")) {
			driver.switchTo().defaultContent();

		} else if (type.equalsIgnoreCase("multiframe")) {
			driver.switchTo().frame(element);
		}

	}

}
