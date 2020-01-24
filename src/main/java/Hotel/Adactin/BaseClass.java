package Hotel.Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
static WebDriver dr;
public static void Launch(String url) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\karthik\\Adactin\\driver\\chromedriver.exe");
	dr=new ChromeDriver();
	dr.get(url);
}

public static void Send(WebElement loc, String val) {
	loc.sendKeys(val);
}

public static void btnclk(WebElement loc) {
	loc.click();
}
 public static void dropDown(WebElement loc,int value) {
	Select s = new Select(loc);
	s.selectByIndex(value);

}



}
