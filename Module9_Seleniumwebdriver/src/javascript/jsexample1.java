package javascript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.internal.AbstractParallelWorker.Arguments;

public class jsexample1 {
	@Test
	public void example1() {                  

		System.setProperty("webdriver.chrome.driver",
				"F:\\Software\\Selenium11-BrowserDrivers\\Selenium11-BrowserDrivers\\BrowserDrivers\\chromedriver_win32_v2_36\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();             
		driver.manage().window().maximize();              
		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);  
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);  
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("login")).sendKeys("abc@gmail.com");;
		driver.findElement(By.name("passwd")).sendKeys("123");;
		WebElement we = driver.findElement(By.name("proceed"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",we);          // clicking on button arguments.click is defined syntax to click on button in java script
        //js.executeScript("document.getElementByName('proceed').click();");
		//js.executeScript("arguments[0].click();",we,we1,we3);  // click by indexing of argument and defined index
}
}