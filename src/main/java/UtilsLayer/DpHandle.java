package UtilsLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.DemoBaseClass;

public class DpHandle extends DemoBaseClass {

	public static void selectDPbyVisiableText(WebElement wb, String value) {
		new Select(wb).selectByVisibleText(value);
	}

	public static String selectedDPValue(WebElement wb) {
		return new Select(wb).getFirstSelectedOption().getText();
	}

}
