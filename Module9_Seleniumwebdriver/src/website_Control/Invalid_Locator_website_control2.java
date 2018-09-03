package website_Control;

import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Invalid_Locator_website_control2 {

	@Test
	public void example1() {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Software\\Selenium11-BrowserDrivers\\Selenium11-BrowserDrivers\\BrowserDrivers\\chromedriver_win32_v2_36\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();         
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().window().maximize();  
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).clear();                      // clear already passed value
		driver.findElement(By.id("email")).sendKeys("kanchan12@gmail.com");
		driver.findElement(By.id("passwdXX")).sendKeys("123");

	}

}