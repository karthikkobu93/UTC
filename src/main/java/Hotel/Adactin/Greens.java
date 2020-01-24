package Hotel.Adactin;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\karthik\\Adactin\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		driver.findElement(By.xpath("(//button[contains(text(),'click the button')])[3]")).click();
		Alert a = driver.switchTo().alert();
		a.sendKeys("kar");
		Thread.sleep(10000);
		a.accept();
		
		
		
		
		
//		WebElement first = driver.findElement(By.xpath("(//a[@class='analystic'])[1]"));
//	     first.click();
//	     driver.findElement(By.xpath("(//button[contains(text(),'click the button')])[1]")).click();
//	    Alert a=(Alert) driver;
//	    Alert a = driver.switchTo().alert();
//	    Thread.sleep(10000);
//	    a.accept();
//	    WebElement y = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
//	    y.click();
//	    driver.findElement(By.xpath("(//button[contains(text(),'click the button')])[2]")).click();
//		Alert b=driver.switchTo().alert();
//		b.dismiss();
//		  WebElement z = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
//		    z.click();
//		    driver.findElement(By.xpath("(//button[contains(text(),'click the button')])[3]")).click();
//			Alert c=driver.switchTo().alert();
//			c.sendKeys("kartos");
//			c.accept();
		
	}

}
