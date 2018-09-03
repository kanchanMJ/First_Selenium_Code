package frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class frameexample {
	@Test
	public void example1() {                  

		System.setProperty("webdriver.chrome.driver",
				"F:\\Software\\Selenium11-BrowserDrivers\\Selenium11-BrowserDrivers\\BrowserDrivers\\chromedriver_win32_v2_36\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();             
		driver.manage().window().maximize();              
		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);  
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);  // for finding element... it will not w8 for invisible
		driver.get("http://apycom.com/website-buttons/exframe.html");

		driver.switchTo().frame("top_wnd");
		WebElement we =driver.findElement(By.xpath("/html/body/p/span"));   // if without switch frame it will display not display .. switch the window
        System.out.println("elemnt is present on "+we.isDisplayed());
		driver.switchTo().defaultContent();         // from switching from to another frame need to set default content
		driver.switchTo().frame("main_wnd");
	}
}