package Findelemets;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class getalllinks {
	@Test
	public void launch_google_chrome() {                  

		System.setProperty("webdriver.chrome.driver",
				"F:\\Software\\Selenium11-BrowserDrivers\\Selenium11-BrowserDrivers\\BrowserDrivers\\chromedriver_win32_v2_36\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();             
		driver.manage().window().maximize();              
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);  
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);  
		driver.get("http://newtours.demoaut.com/");
		
		List<WebElement> allelem = driver.findElements(By.xpath("//a"));
		System.out.println("Count of all links on web page is "+allelem.size());
		
		List<WebElement> allimages = driver.findElements(By.xpath("//img"));
		System.out.println("Count of all images on page are "+allimages.size());
		//driver.quit();
}
}