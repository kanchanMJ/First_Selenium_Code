package window;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class focuswindow2 {
	@Test
	public void example1() {                  

		System.setProperty("webdriver.chrome.driver",
				"F:\\Software\\Selenium11-BrowserDrivers\\Selenium11-BrowserDrivers\\BrowserDrivers\\chromedriver_win32_v2_36\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();             
		driver.manage().window().maximize();              
		driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);  
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);  // for finding element... it will not w8 for invisible
		driver.get("https://www.jobserve.com/in/en/Job-Search/");

		String basewindowid=driver.getWindowHandle();            // finding base window id
		System.out.println("Base window id is "+basewindowid);

		driver.findElement(By.xpath("//*[@id='mainfooter']/div[4]/a")).click();

		Set<String> allwid2=driver.getWindowHandles();                 // finding all window ids
		System.out.println("The window count is "+allwid2.size());
		
		for(String win : allwid2) {
			
			if(win.equals(basewindowid)) {
				
			}else {
				driver.switchTo().window(win);
				WebElement wd=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/img"));
				System.out.println("the element is present of window "+wd.isDisplayed());
				//driver.close();
			}
			
			driver.switchTo().window(basewindowid);
		}

	}
}