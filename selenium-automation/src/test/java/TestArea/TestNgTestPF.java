package TestArea;



import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import framework.BaseTest;
import pageObject.pageFactory.herokuapp.LoginPagePF;

public class TestNgTestPF extends BaseTest{
	
	@Test
	public void loginTestcase01() {
		
		driver = openBrowserURL("chrome", "https://the-internet.herokuapp.com/");
		LoginPagePF loginPage = PageFactory.initElements(driver, LoginPagePF.class);
		loginPage.clickForm();
		loginPage.loginForm("tomsmith", "SuperSecretPassword");
		
//		SoftAssert verify = new SoftAssert();
//		verify.assertEquals("Test", "xxx");
//		verify.assertEquals("xxx", "xxx");
//		verify.assertAll();
//		verify.assertTrue(true);
//		assertEquals("Test", "xxx");
//		assertTrue(false);
	}

}
