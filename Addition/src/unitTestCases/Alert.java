package unitTestCases;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Alert {
	
	WebDriver driver;
	
	@Test
	public void AlertBox() 
	{
		driver = new FirefoxDriver();
		driver.get("http://localhost/Test/Follow.html#.Ubr5jUoiy_J");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("html/body/input")).click();
		driver.switchTo().alert().accept();
	

	}

}
