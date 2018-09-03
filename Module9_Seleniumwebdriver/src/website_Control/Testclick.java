package website_Control;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testclick {

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

		System.out.println("Tital of current page is :"+driver.getTitle());

		driver.findElement(By.xpath("//*[@id='id_gender2']")).click();
		driver.findElement(By.xpath("//*[@id='customer_firstname']")).sendKeys("Kanchan");
		driver.findElement(By.xpath("//*[@id='customer_lastname']")).sendKeys("Jadhav");
		if(driver.findElement(By.xpath("//*[@id='account-creation_form']")).isSelected()) {

		}else {
			driver.findElement(By.xpath("//*[@id='account-creation_form']/div[1]/div[7]/label")).click();
		}

	}
}