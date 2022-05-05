package BaseLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBaseClass {
	public static WebDriver driver;

	public static void intilization(String url) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\praf0\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);

	}

}
