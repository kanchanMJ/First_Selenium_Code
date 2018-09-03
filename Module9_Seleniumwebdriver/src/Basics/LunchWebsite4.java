package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;                // for execute code with testing build and add testNg library 

public class LunchWebsite4 {                      // for every project need to import library
	@Test
	public void launch_google_chrome() {
		// provide the path of web driver of chrome
		System.setProperty("webdriver.chrome.driver",
				"F:\\Software\\Selenium11-BrowserDrivers\\Selenium11-BrowserDrivers\\BrowserDrivers\\chromedriver_win32_v2_36\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();          //constructor -> open browser
		driver.manage().window().maximize();               // defining maximum time to load website -> session level applicble to all window opening
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);   // page time out after time if not loaded
		driver.get("https://www.naukri.com/");
		driver.quit();                         
	}

}
