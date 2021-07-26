package framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public abstract class BasePage {
	
	protected WebDriver driver;
			
	public void setup(){
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@AfterTest
	public void cleanUp() {
		driver.close();
	}

}
