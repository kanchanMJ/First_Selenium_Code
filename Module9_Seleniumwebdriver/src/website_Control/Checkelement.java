package website_Control;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Checkelement {


	@Test
	public void checkhidelables() {

		System.setProperty("webdriver.chrome.driver",
				"F:\\Software\\Selenium11-BrowserDrivers\\Selenium11-BrowserDrivers\\BrowserDrivers\\chromedriver_win32_v2_36\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();          
		driver.manage().window().maximize();              
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);  
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com");
        //not prese4nt in DOm and UI
	/*	try {
        driver.findElement(By.xpath(xpathExpression)).isdisplayed();
		}catch{
			
		}
        //present in dom not on UI
        try {
        	
        }catch{
        	
        }
        //present on dom and UI
        try {
        	
        }catch{
        	
        }  */
	}
	}
