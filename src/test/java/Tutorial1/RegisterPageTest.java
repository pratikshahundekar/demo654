package Tutorial1;

import org.openqa.selenium.By;

import BaseLayer.BaseClassDemo;
import PageLayer.RegisterPage;
import UtilsLayer.UtilsClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterPageTest extends BaseClassDemo {

	@Given("user is on register page")
	public void user_is_on_register_page() {
		BaseClassDemo.intilization();
	}

	@When("user enter {string}, {string},{string}  and {string}")
	public void user_enter_and(String companyname, String emailId, String password, String confirmpassword) {
		RegisterPage register = new RegisterPage();
		register.registerNewUser(companyname, emailId, password, confirmpassword);

	}

	@Then("user will be home page")
	public void user_will_be_home_page() {
		UtilsClass.takeScreenshot();
		
	}

}
