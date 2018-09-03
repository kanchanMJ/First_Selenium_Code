package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;                // for execute code with testing build and add testNg library 

public class LunchWebsite {                      // for every project need to import library
	@Test
	public void launch_google_chrome() {
    // provide the path of web driver of chrome
		System.setProperty("webdriver.chrome.driver",
				"F:\\Software\\Selenium11-BrowserDrivers\\Selenium11-BrowserDrivers\\BrowserDrivers\\chromedriver_win32_v2_36\\chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		//driver.quit();
	}
	
	@Test
	public void launch_google_IE() {
    // provide the path of web driver of ie
		System.setProperty("webdriver.ie.driver",
	   "F:\\Software\\Selenium11-BrowserDrivers\\Selenium11-BrowserDrivers\\BrowserDrivers\\IEDriverServer_Win32_3.11.1\\IEDriverServer.exe");
		InternetExplorerDriver driver = new InternetExplorerDriver();
		driver.get("https://www.gmail.com/");
		//driver.quit();
	}
	@Test
	public void fetching_details_to_eclipse(){
	  //Look
}
