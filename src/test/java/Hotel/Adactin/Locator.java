package Hotel.Adactin;

import org.openqa.selenium.support.PageFactory;

public class Locator extends BaseClass {
	
	public Locator() {
		PageFactory.initElements(driver, this);
	}

}
