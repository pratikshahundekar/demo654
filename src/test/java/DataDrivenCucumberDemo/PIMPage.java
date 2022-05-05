package DataDrivenCucumberDemo;

import org.junit.Assert;
import org.openqa.selenium.By;

import BaseLayer.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PIMPage extends BaseClass {
	String employeeid;

	@Given("user is on present on login page")
	public void user_is_on_present_on_login_page() {
		BaseClass.intilization();
	}

	@When("user enter valid credentails")
	public void user_enter_valid_credentails() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("user is on home page of application")
	public void user_is_on_home_page_of_application() {
		System.out.println(driver.getTitle());
	}

	@Then("validate user on home page by using title")
	public void validate_user_on_home_page_by_using_title() {
		String actualtitle = driver.getTitle();
		Assert.assertEquals(actualtitle.contains("HRM"), true);
	}

	@Then("validate user on home page by using Url")
	public void validate_user_on_home_page_by_using_url() {
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl.contains("dashboard"), true);
	}

	@Then("validate user on home page by using logo")
	public void validate_user_on_home_page_by_using_logo() {
		boolean actualLogo = driver.findElement(By.xpath("//img[@alt='OrangeHRM']")).isDisplayed();
		Assert.assertEquals(actualLogo, true);
	}

	@Given("user is on pim page and click on add  button")
	public void user_is_on_pim_page_and_click_on_add_button() {
		driver.findElement(By.xpath("//b[text()='PIM']")).click();
		driver.findElement(By.id("btnAdd")).click();
	}

	@When("create a new employee {string} and {string} and {string}")
	public void create_a_new_employee_and_and(String fname, String mname, String lname) {

		driver.findElement(By.id("firstName")).sendKeys(fname);
		driver.findElement(By.id("middleName")).sendKeys(mname);
		driver.findElement(By.id("lastName")).sendKeys(lname);

		employeeid = driver.findElement(By.id("employeeId")).getAttribute("value");
		driver.findElement(By.id("btnSave")).click();
	}

	@When("search user by using employee id")
	public void search_user_by_using_employee_id() {
		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
		driver.findElement(By.id("empsearch_id")).sendKeys(employeeid);
		driver.findElement(By.id("searchBtn")).click();
	}

	@Then("delete newly created user")
	public void delete_newly_created_user() {
		driver.findElement(By.xpath("//table[@id='resultTable']//td[1]")).click();
		driver.findElement(By.id("btnDelete")).click();
		driver.findElement(By.id("dialogDeleteBtn")).click();
	}

	
}
