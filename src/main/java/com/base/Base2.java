package com.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base2 {
	
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

		}public static void clickonElement(String type,WebElement element) {
			if (type.equalsIgnoreCase("click")) {
				element.click();
			} else if (type.equalsIgnoreCase("clear")) {
				element.clear();
				
			} 

			


		}

		public static void inputValueElement(WebElement element, String data) {
			// Username.sendkeys( data)
			element.sendKeys(data);

		}

		public static void Driver_operations(String type) {
			if (type.equalsIgnoreCase("close")) {
				driver.close();
				
			} else if (type.equalsIgnoreCase("quit")) {
				driver.quit();
			} else if (type.equalsIgnoreCase("forward")) {
				driver.navigate().forward();
			}else if (type.equalsIgnoreCase("back")) {
				driver.navigate().back();
			}else if (type.equalsIgnoreCase("refresh")) {
				driver.navigate().refresh();
			}

			
			
		}

		public static void getUrl(String url) {

			driver.get(url);
		}
		
		public static  void multidropdown (String type,WebElement element) {
			
			Select s = new Select(element);
			
			
			if (type.equalsIgnoreCase("getoptions")) {
				List<WebElement> options = s.getOptions();
				for (WebElement webElement : options) {
					String text = webElement.getText();
					System.out.println(text);
				}
				
			} else if (type.equalsIgnoreCase("getselected")) {
				List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
				for (WebElement webElement : allSelectedOptions) {
					String data1 = webElement.getText();
					System.out.println(data1);
				}
			} else if (type.equalsIgnoreCase("firstselect")) {
				WebElement firstSelectedOption = s.getFirstSelectedOption();
				String text = firstSelectedOption.getText();
				System.out.println(text);
				
			}else if (type.equalsIgnoreCase("ismultiple")) {
				boolean multiple = s.isMultiple();
				System.out.println(multiple);
				
			}{

			}
			
		}

		
		
		public static void dropdown( String type,WebElement element, String data) {
			
			try {
				Select s = new Select(element);
				
				if (type.equalsIgnoreCase("byvalue")) {
					s.selectByValue(data);
					
				}else if (type.equalsIgnoreCase("bytext")) {
					s.selectByVisibleText(data);
					
				}else if (type.equalsIgnoreCase("byindex")) {
					int index = Integer.parseInt(data);
					s.selectByIndex(index);
					
				}
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			
				
			

		
		}
		public static void waitbrowser(String type,int sec) throws Exception {
			if (type.equalsIgnoreCase("wait")) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
			} else if (type.equalsIgnoreCase("longwait")) {
				Thread.sleep(sec);
			} 

			
			

		}
		public static void windowhandle(String type ) {
			if (type.equalsIgnoreCase("handleswindow")) {
				
				Set<String> windowHandles = driver.getWindowHandles();
				for (String str : windowHandles) {
					String title = driver.switchTo().window(str).getTitle();
					System.out.println(title);
				}
				
				String su = "Electronics Store: Buy Electronics products Online at Best Prices in India at Amazon.in";
				for (String str : windowHandles) {
					if (driver.switchTo().window(str).getTitle().equals(su)) {
						break;
						
					}
				}
				
		
				
			}

			}
		public static void robotactions(String type) throws Exception {
			try {
				Robot r = new Robot();
				if (type.equalsIgnoreCase("keypress")) {
					r.keyPress(KeyEvent.VK_DOWN);
					
				} else if (type.equalsIgnoreCase("keyrelease")) {
					r.keyRelease(KeyEvent.VK_DOWN);
				} else if (type.equalsIgnoreCase("keyenter")) {
					r.keyPress(KeyEvent.VK_ENTER);
				} else if (type.equalsIgnoreCase("keyenter1")) {
					r.keyRelease(KeyEvent.VK_ENTER);

				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
		}
		
		
		public static   void TakesScreenshot(String path) throws Exception {
			
			TakesScreenshot ts = (TakesScreenshot) driver;
			File scr = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File(path);
		    FileUtils.copyFile(scr, dest);;
		    
		}
		
		public static void Actionclass(String type,WebElement element) {
			
			try {
				Actions ac = new Actions(driver);
				if (type.equalsIgnoreCase("moveto")) {
					
					ac.moveToElement(element).build().perform();
					
				} else if (type.equalsIgnoreCase("clickon")) {
					ac.click(element ).build().perform();
				}else if (type.equalsIgnoreCase("rightclick")) {
					ac.contextClick(element).build().perform();
					
				}else if (type.equalsIgnoreCase("doubleclick")) {
					ac.doubleClick(element).build().perform();
					
				}
			} catch (Exception e) {
				e.printStackTrace();
			} 
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

		}
}
