package unitTestCases;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import static org.junit.Assert.assertEquals;
import java.util.List;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CountLink {

	WebDriver driver;

	@Test
	public void countLink() throws Throwable {

		try {

			driver = new FirefoxDriver();
			driver.get("http://book.theautomatedtester.co.uk/");
			List<WebElement> objList = driver.findElements(By.tagName("a"));
			System.out.println("No of link is = " + objList.size());
			assertEquals(5, objList.size());
		} catch (Throwable t) {
			getScreenshot("one");
			throw t;
		}

	}

	/* Capture the screenshots -- Utsav Solanki */

	public void getScreenshot(String fileName) throws Throwable {
		File scrFile = ((TakesScreenshot) driver)
				.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("d:\\" + "one" + "_"
				+ System.currentTimeMillis() + ".jpeg"), true);

	}

	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
