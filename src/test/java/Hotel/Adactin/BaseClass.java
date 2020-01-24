package Hotel.Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	static WebDriver driver;

	public static void launchBrowser(String url) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\karthik\\Adactin\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
	}

	public static void type(WebElement loc, String s1) {
		loc.sendKeys(s1);

	}

	public static void pass(WebElement loc, String p1) {

	}

	public static void login(WebElement loc) {
		loc.click();
	}

}
