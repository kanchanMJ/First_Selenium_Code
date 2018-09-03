package website_Control;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import java.util.*;

public class dropdown {

	@Test
	public void launch_google_chrome() {

		System.setProperty("webdriver.chrome.driver",
				"F:\\Software\\Selenium11-BrowserDrivers\\Selenium11-BrowserDrivers\\BrowserDrivers\\chromedriver_win32_v2_36\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();          
		driver.manage().window().maximize();              
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);  
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);  
		driver.get("http://automationpractice.com/index.php");

		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		driver.findElement(By.id("email_create")).sendKeys("kanchan124@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();

		//dropdown selection
		WebElement we1= driver.findElement(By.xpath(".//*[@id='days']"));
		Select s1 = new Select(we1);
		s1.selectByValue("24");
		WebElement we2= driver.findElement(By.xpath(".//*[@id='months']"));
		Select s2 = new Select(we2);
		s2.selectByVisibleText("September ");
		WebElement we3= driver.findElement(By.xpath(".//*[@id='years']"));
		Select s3 = new Select(we3);
		s3.selectByIndex(2);


		List<WebElement> l1= s3.getOptions();
		boolean flag=false;
		for(WebElement w:l1) {
			if(w.getText().trim().equals("2017")) {
				flag=true;
				break;
			}
		}

		if(flag) {
			System.out.println("Value is present 2017");
		}
		else {
			System.out.println("Not present");
		}
		
		String dfvalue = driver.findElement(By.xpath(".//*[@id='search_query_top']")).getAttribute("placeholder");
		System.out.println("Default value of search box is : "+dfvalue);

		//driver.quit();
	}
}