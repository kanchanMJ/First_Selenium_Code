package Practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class register_claimant {
	@Test
	
	public void claimantregister() {
		
		System.setProperty("webdriver.chrome.driver",
				"F:\\Software\\Selenium11-BrowserDrivers\\Selenium11-BrowserDrivers\\BrowserDrivers\\chromedriver_win32_v2_36\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.get("https://dev.rebeacon.dllr.md.gov/NeosuranceStaff/Account/Login");
		
		driver.findElementById("UserName").sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("?MWC2017?");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		driver.findElement(By.xpath("//div[@class='k-window-actions']//a[@role='button' and @class='k-window-action k-link']//span[@role='presentation' and contains(text(),'Close')]")).click();
		driver.findElement(By.xpath("//a[text()='Benefit Services']")).click();
		driver.findElement(By.xpath("//a[text()='Register Claimant']")).click();
		driver.findElementById("txtSsn").sendKeys("457891448");
		driver.findElementById("txtIstrConfirmSSN").sendKeys("457891448");
		driver.findElement(By.xpath("//input[@id='btnNextForm']")).click();
		
		driver.findElement(By.xpath("//input[@id='rblRadioButtonList4_1']")).click();
	    driver.findElementById("rblDPATerms_0").click();
	    driver.findElement(By.xpath("//a[@class='buttonNext']")).click();
	    //driver.findElementById("txtBirthDate").sendKeys("01011987");
	    
	    driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']")).click();
	    WebDriverWait wait=new WebDriverWait(driver, 60);
	    WebElement yea=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
	    Select year = new Select(yea); //.getCssValue("1987");
	    year.selectByVisibleText("1987");
	    WebElement mot=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
	    Select month= new Select(mot); //.getCssValue("0");
	    month.selectByVisibleText("Jan");
	  /*  WebElement dd=driver.findElement(By.xpath("//a[@class='ui-state-default']"));
	    Select Day = new Select (dd);
	    Day.selectByVisibleText("1"); */
	    driver.findElement(By.xpath("//a[text()=1 and @class='ui-state-default']")).click();
	    
	    driver.findElementById("rblGender_0").click();
	    driver.findElementById("txtTextBox4").sendKeys("kanchan");
	    driver.findElementByName("txtTextBox6").sendKeys("Test");
	    driver.findElement(By.xpath("//a[@class='buttonNext']")).click();
	    driver.findElement(By.xpath("//input[@id='ChkCurrentWeekOne']")).click();
	    driver.findElement(By.xpath("//a[@class='buttonNext']")).click();
	    driver.findElement(By.xpath("//input[@id='chkRegEmployedInStateCheckBox']")).click();
	    driver.findElement(By.xpath("//input[@id='rblHomeState_1']")).click();
	}
	

}
