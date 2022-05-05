package UtilsLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import BaseLayer.BaseClassDemo;

public class Demo extends BaseClassDemo {

	public static void main(String[] args) {
		BaseClassDemo.intilization();
		
		WebElement wb =driver.findElement(By.name("company_name"));
		
		Actions act =new Actions(driver);
		act.sendKeys(wb, "tcs")
		.sendKeys(Keys.TAB,"tcs123@gmail.com")
		.sendKeys(Keys.TAB,"12345678")
		.sendKeys(Keys.TAB,"12345678")
		.sendKeys(Keys.TAB,Keys.ENTER)
		.build().perform();

		
	}
}
