package unitTestCases;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class popupWindow {
	WebDriver driver;

	@Test
	public void PopupWindow() {
		driver = new FirefoxDriver();
		driver.get("http://book.theautomatedtester.co.uk/chapter1");
		// store the current window
		String mainWindow = driver.getWindowHandle();
		driver.findElement(By.id("multiplewindow")).click();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		String data = driver.switchTo().window("popupwindow").findElement(
				By.id("popuptext")).getText();
		System.out.println(data);
		driver.close();
		// driver.switchTo().window("popupwindow").close();
		// switch to current window
		driver.switchTo().window(mainWindow);

		boolean status = driver.findElement(By.id("verifybutton"))
				.isDisplayed();
		 
		
		assertTrue("Button is not present ", status);
	}

}
