package Practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Xpath {
	
	@Test
	
	public void findxpath() {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Software\\Selenium11-BrowserDrivers\\Selenium11-BrowserDrivers\\BrowserDrivers\\chromedriver_win32_v2_36\\chromedriver.exe");
		ChromeDriver drv = new ChromeDriver();
		
		drv.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		drv.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		drv.manage().window().maximize();
		drv.get("https://css-tricks.com/dom/");
		
		WebElement w =drv.findElement(By.xpath("//nav[@class='main-nav' and ul/li[2]]"));
		Actions alt = new Actions(drv);
		alt.moveToElement(w).perform();
		
		drv.findElement(By.xpath("//*[@id=\"main-nav\"]/ul/li[2]/a")).click();
		
		
	}

}
