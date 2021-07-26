package TestArea;


import org.testng.annotations.Test;

import framework.BaseTest;
import pageObject.herokuapp.LoginPage;

public class TestNgTest extends BaseTest{
	
//	private WebDriver driver;
	//https://the-internet.herokuapp.com/
	//http://demosite.center/wordpress/wp-login.php
	
	//TestData
	String userName = "tomsmith";
	String pwName = "SuperSecretPassword";

	@Test
	public void login() {


//		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\browserDrivers\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		driver.get("https://the-internet.herokuapp.com/");
		
//		
		LoginPage login = new LoginPage();
		login.formLink.click();
		login.userTextbox.enter(userName);
//		login.userTextbox.sendKeys(pwName);
//		login.loginButton.click();
//		
		
//		driver.findElement(By.xpath("//a[@href='/login']")).click();
//		driver.findElement(By.id("username")).sendKeys("tomsmith");
//		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
		login.driver.close();
	}
	

	
}
