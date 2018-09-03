package Basics;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;                // for execute code with testing build and add testNg library 

public class LunchWebsite2 {                      // for every project need to import library
	@Test
	public void launch_google_chrome() {
		// provide the path of web driver of chrome
		System.setProperty("webdriver.chrome.driver",
				"F:\\Software\\Selenium11-BrowserDrivers\\Selenium11-BrowserDrivers\\BrowserDrivers\\chromedriver_win32_v2_36\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();          //constructor -> open browser
		driver.get("https://www.naukri.com/");

		String act_tital = driver.getTitle();
		String exp_tital ="Jobs - Recruitment - Job Search - Employment - Job Vacancies - Naukri";
		System.out.println(act_tital);

		if(act_tital.equals(exp_tital)) 
			System.out.println("matched");
		else
			System.out.println("not matched");

		System.out.println(driver.getCurrentUrl());

		driver.quit();                         // kill the process and sessions
	}

}
