package ReadXml;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
	public static void main(String[] args) throws Exception {
		JAXBContext ja = JAXBContext.newInstance(Fblogin.class);
		Unmarshaller un = ja.createUnmarshaller();
		File loc = new File(
				"C:\\Users\\Admin\\eclipse-workspace\\karthik\\Adactin\\src\\main\\java\\ReadXml\\DataBase.xml");
		Object obj = un.unmarshal(loc);
		Fblogin fb = (Fblogin) obj;
//	System.out.println(fb.getUsername());
//	System.out.println(fb.getPassword());

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\karthik\\Adactin\\driver\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.facebook.com/");

		dr.findElement(By.id("email")).sendKeys(fb.getUsername());
		dr.findElement(By.id("pass")).sendKeys(fb.getPassword());

	}
}
