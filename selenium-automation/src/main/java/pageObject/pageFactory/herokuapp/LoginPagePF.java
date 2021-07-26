package pageObject.pageFactory.herokuapp;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPagePF {
	
	@FindBy(how=How.LINK_TEXT, using = "Form Authentication") WebElement formLink;
		
	@FindBy(how=How.ID, using = "username") WebElement usernameTextbox;
	
	@FindBy(how=How.ID, using = "password") WebElement passwordTextbox;
	
	@FindBy(how=How.XPATH, using = "//button[@type='submit']") WebElement loginButton;
	
	public void clickForm(){
		
//		SoftAssert verify = new SoftAssert();
//		verify.assertTrue(formLink.getText().equals("Logi"));
//		verify.assertAll();
//		assertTrue(formLink.getText().equals("Login"));
		System.out.println(formLink.getText());
		formLink.click();
	}

	public void loginForm(String Username, String Password) {
		usernameTextbox.sendKeys(Username);
		passwordTextbox.sendKeys(Password);
		loginButton.click();
		
	}
	
	
		
}
