package mouse_moment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class movemouseelement {

	@Test
	public void example1() {                  

		System.setProperty("webdriver.chrome.driver",
				"F:\\Software\\Selenium11-BrowserDrivers\\Selenium11-BrowserDrivers\\BrowserDrivers\\chromedriver_win32_v2_36\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();             
		driver.manage().window().maximize();              
		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);  
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);  
		driver.get("https://www.americangolf.eu/");

		WebElement golfref = driver.findElement(By.xpath(".//*[@id='header-navigation']/div[1]/ul/li[2]/a")); 
		Actions act=new Actions(driver);
		act.moveToElement(golfref).perform();
		
		//explicit wait condition for particular element... if wait not added it will throw an exception for element not visible
		WebDriverWait wait=new WebDriverWait(driver, 60);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='CLUBS_1']/ul/li[1]/ul/li[1]/a/span[1]")));
		
		driver.findElement(By.xpath(".//*[@id='CLUBS_1']/ul/li[1]/ul/li[1]/a/span[1]")).click();
		
		driver.quit();
}
}