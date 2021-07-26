package framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebManager {

	static WebDriver driver;
	
	public static WebDriver startBrowser(String browserType, String url) {
		if(browserType.equals("firefox")) {
			
		} else if (browserType.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\browserDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
				} else if (browserType.equals("IE")) {
			
		} else if (browserType.equals("safari")) {
			
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		
		return driver;
	}
	
}
