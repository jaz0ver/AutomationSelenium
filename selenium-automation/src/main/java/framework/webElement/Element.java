package framework.webElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Element {
	
	WebDriver driver;
	By by;
	
	public Element(By by) {
		this.by = by;		
	}
	
	public void click() {
		getElement().click();
	}
	
	public void enter(String key) {
		getElement().sendKeys(key);
	}
	
	public WebElement getElement() {
		getDriver();
		return driver.findElement(by);
	}
	
	public void getDriver(){
		if (System.getProperty("webdriver.chrome.driver") == null) {
			System.out.println("Start Chromedriver...");
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\browserDrivers\\chromedriver.exe");
			System.getProperty("webdriver.chrome.driver");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://the-internet.herokuapp.com/");
		}
	}

}
