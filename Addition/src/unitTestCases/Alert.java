package unitTestCases;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Alert extends GernalTest
{
	
	WebDriver driver;
	
	@Test
	public void AlertBox() 
	{
		driver = new FirefoxDriver();
		driver.get("http://localhost/Test/Follow.html#.Ubr5jUoiy_J");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(_name)).click();
		driver.switchTo().alert().accept();
	

	}

}
