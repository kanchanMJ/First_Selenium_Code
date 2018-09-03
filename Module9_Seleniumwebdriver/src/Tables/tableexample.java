package Tables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class tableexample {
	@Test
	public void launch_google_chrome() {                  

		System.setProperty("webdriver.chrome.driver",
				"F:\\Software\\Selenium11-BrowserDrivers\\Selenium11-BrowserDrivers\\BrowserDrivers\\chromedriver_win32_v2_36\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();             
		driver.manage().window().maximize();              
		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);  
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);  
		driver.get("https://money.rediff.com/gainers");

		List<WebElement> tableref = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]/a")); 
		int rowsize=tableref.size();
		
		for(int i=0;i<rowsize;i++) {
			String cmpname=tableref.get(i).getText();
			if(cmpname.trim().equals("Vijay Shanthi Bu")) {
				WebElement grpname=driver.findElement(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr["+(i+1)+"]/td[2]"));
				//WebElement grpname=driver.findElement(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr["+i+"]/td[2]"));
				String name=grpname.getText();
				System.out.println(name);
				break;
			}
		}
		
		driver.quit();

}
}
