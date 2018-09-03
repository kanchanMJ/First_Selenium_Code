package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class a {
	@Test
	
	public void testing() {
		
		System.setProperty("webdriver.chrome.driver", "");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts(60,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("");
	}

}
