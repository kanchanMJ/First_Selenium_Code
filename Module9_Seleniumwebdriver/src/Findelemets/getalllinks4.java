package Findelemets;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class getalllinks4 {
	@Test
	public void launch_google_chrome() {                  

		System.setProperty("webdriver.chrome.driver",
				"F:\\Software\\Selenium11-BrowserDrivers\\Selenium11-BrowserDrivers\\BrowserDrivers\\chromedriver_win32_v2_36\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();             
		driver.manage().window().maximize();              
		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);  
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);  
		driver.get("https://money.rediff.com/index.html");

		List<WebElement> allelem = driver.findElements(By.xpath(".//div[@class='div_secto_tabs']/a/div"));    //finding all links on page findelements
		System.out.println("Count of all links on web page is "+allelem.size());
         
		int numlist=allelem.size();
		for(int i=1;i<=numlist; i++) {
			driver.findElement(By.xpath(".//div[@class='div_secto_tabs']/a["+i+"]/div")).click();   // providing direct link locator.. it will not display steal element exception
			System.out.println(driver.getTitle());
			driver.navigate().back();                           // click on back button 
		}

		driver.quit();
		
	}
}