package website_Control;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class website_control {

	@Test
	public void example1() {
		// provide the path of web driver of chrome
		System.setProperty("webdriver.chrome.driver",
				"F:\\Software\\Selenium11-BrowserDrivers\\Selenium11-BrowserDrivers\\BrowserDrivers\\chromedriver_win32_v2_36\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();         
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.findElement(By.id("email")).sendKeys("kanchan12@gmail.com");

	}
	
	@Test
	public void example2() {
		// provide the path of web driver of chrome
		System.setProperty("webdriver.chrome.driver",
				"F:\\Software\\Selenium11-BrowserDrivers\\Selenium11-BrowserDrivers\\BrowserDrivers\\chromedriver_win32_v2_36\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();         
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
          
		WebElement elm=driver.findElement(By.name("email"));
		elm.sendKeys("kanchan123@gmail.com");


	}
}