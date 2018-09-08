package data_driven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class tabledetails {

	@Test

	public void fetch_data_from_table() {

		System.setProperty("webdriver.chrome.driver", 
				"F:\\Software\\Selenium11-BrowserDrivers\\BrowserDrivers\\chromedriver_win32_v2_36\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("https://dev.rebeacon.dllr.md.gov/NeosuranceStaff/Account/Login");
		driver.findElement(By.xpath("//*[@id=\"UserName\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("?MWC2017?");
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		
		WebDriverWait wt = new WebDriverWait(driver, 60);
		wt.until(ExpectedConditions.visibilityOfAllElements(driver.findElement(By.xpath("//*[@id=\"btnLogin\"]"))
				,driver.findElement(By.xpath("//*[@id=\"MenuUl\"]/li[2]/a"))));
		
		driver.findElement(By.xpath("//*[@id=\"MenuUl\"]/li[2]/a")).click();
		Select we = new Select(driver.findElement(By.xpath("//*[@id=\"txtClaimStatusCodeValue\"]")));
		we.selectByValue("Active");
		driver.findElement(By.xpath("//*[@id=\"btnSearch\"]")).click();

	}

}
