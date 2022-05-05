package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClassDemo;

public class RegisterPage extends BaseClassDemo {

	@FindBy(name = "company_name")
	WebElement companyName;

	@FindBy(name = "email")
	WebElement email;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(name = "password_confirmation")
	WebElement confirmPassword;

	@FindBy(id = "save-form")
	WebElement signUp;

	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}

	public void registerNewUser(String cname, String Email, String pass, String cpass) {
		companyName.sendKeys(cname);
		email.sendKeys(Email);
		password.sendKeys(pass);
		confirmPassword.sendKeys(cpass);
		//signUp.click();
	}

}
