package chromeoptions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class example1 {
	@Test
	public void launch_google_chrome() {                  // firefoxoption, internetoption
		ChromeOptions options = new ChromeOptions();     // method help to supress the notification and infobars
        options.addArguments("--disable-infobars");      // we can define the size of window by window-size
        options.addArguments("disable-notification");
		System.setProperty("webdriver.chrome.driver",
				"F:\\Software\\Selenium11-BrowserDrivers\\Selenium11-BrowserDrivers\\BrowserDrivers\\chromedriver_win32_v2_36\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(options);       // lunch browser with defined settings in option object        
		driver.manage().window().maximize();              
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);  
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);  
		driver.get("http://automationpractice.com/index.php");
		//driver.quit();

}
}