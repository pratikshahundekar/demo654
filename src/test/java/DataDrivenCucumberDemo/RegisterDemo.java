package DataDrivenCucumberDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseLayer.DemoBaseClass;
import UtilsLayer.DpHandle;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterDemo extends DemoBaseClass {
	@Given("user is on fb regiser page")
	public void user_is_on_fb_regiser_page() {
		DemoBaseClass.intilization("https://www.facebook.com/reg");
	}

	@When("user enter {string}, {string}, {string}, {string}")
	public void user_enter(String fname, String lname, String mobno, String pass) throws InterruptedException {
		driver.findElement(By.name("firstname")).sendKeys(fname);
		driver.findElement(By.name("lastname")).sendKeys(lname);
		driver.findElement(By.name("reg_email__")).sendKeys(mobno);
		driver.findElement(By.name("reg_passwd__")).sendKeys(pass);

	}

	@When("user {string} and {string}")
	public void user_and(String monthDp, String yeardp) throws InterruptedException {

		WebElement Month = driver.findElement(By.name("birthday_month"));
		DpHandle.selectDPbyVisiableText(Month, monthDp);

		WebElement Year = driver.findElement(By.name("birthday_year"));
		DpHandle.selectDPbyVisiableText(Year, yeardp);
		Thread.sleep(5000);
	}

	@Then("user will be created")
	public void user_will_be_created() {
		System.out.println("user is created");
		driver.quit();
	}	

}
