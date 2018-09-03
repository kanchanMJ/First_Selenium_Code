package Waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

public class fluentwt {
	@Test
	public void example1() {                  

		System.setProperty("webdriver.chrome.driver",
				"F:\\Software\\Selenium11-BrowserDrivers\\Selenium11-BrowserDrivers\\BrowserDrivers\\chromedriver_win32_v2_36\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();             
		driver.manage().window().maximize();              
		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);  
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);  // for finding element... it will not w8 for invisible
		driver.get("https://www.infosys.com/");

		FluentWait wait = new FluentWait(driver);
		wait.withTimeout(90, TimeUnit.SECONDS);
		wait.pollingEvery(2, TimeUnit.SECONDS);    // setting time to refresh the page and finding element 

		try {
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='home-page-carousel']/div/a[3]/div[2]/div/h3")));
			driver.findElement(By.xpath("//*[@id='home-page-carousel']/div/a[3]/div[2]/div/h3")).click();
			System.out.println(driver.getTitle());
		}catch(Exception e) {
			System.out.println("Elememnt not found");
		}
  // explicity only for single element
		//driver.quit();
	}
}