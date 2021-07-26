package framework;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class BaseTest {
	
	protected static WebDriver driver;
	
	public static WebDriver openBrowserURL(String browser, String URL) {
		return driver = WebManager.startBrowser(browser, URL);
	}
	
	@AfterTest
	public void closeDriver() {
		driver.quit();
	}
}
