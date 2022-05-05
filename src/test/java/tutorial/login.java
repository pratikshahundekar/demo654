package tutorial;

import java.util.List;

import org.openqa.selenium.By;

import BaseLayer.BaseClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login extends BaseClass {
	@Given("user is on login page")
	public void user_is_on_login_page() {
		BaseClass.intilization();
	}

	@When("user enter valid username and valid password")
	public void user_enter_valid_username_and_valid_password() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");

		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("user is on home page")
	public void user_is_on_home_page() {

	}

}
