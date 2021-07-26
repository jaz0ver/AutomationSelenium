package pageObject.herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

import framework.webElement.Element;


public class LoginPage{
	
	public WebDriver driver;
	
	//Constructor
//	public LoginPage(WebDriver driver) {
//		this.driver = driver;
//	}
//	

	
	//WebElements
	public Element formLink = new Element(By.xpath("//a[@href='/login']"));
	public Element userTextbox = new Element(By.id("username"));
//	public WebElement pwTexbox = driver.findElement(By.id("password"));
//	public WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
	
//	public WebElement formLink = driver.findElement(By.xpath("//a[@href='/login']"));
//	public WebElement userTextbox = driver.findElement(By.id("username"));
//	public WebElement pwTexbox = driver.findElement(By.id("password"));
//	public WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
	
//	//working
//	public WebElement formLink() {
//		System.out.println("Form Click");
//		return driver.findElement(By.xpath("//a[@href='/login']"));
//	}

//	//test
//	public WebElement WebElement(By by) {
//		getDriver();
//		return driver.findElement(by);
//	}
	
//	public void getDriver(){
//		if (System.getProperty("webdriver.chrome.driver") == null) {
//			System.out.println("Start Chromedriver...");
//			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\browserDrivers\\chromedriver.exe");
//			System.getProperty("webdriver.chrome.driver");
//			driver = new ChromeDriver();
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			driver.manage().window().maximize();
//			driver.get("https://the-internet.herokuapp.com/");
//		}
//	}
	
	@AfterTest
	public void cleanUp() {
		driver.close();
	}
	
	
	
}
