package allPage;

import org.openqa.selenium.WebDriver;

public class GoogleHomePage extends Generic {
	String searchElement = "//input[@class ='gLFyf gsfi']";

	public GoogleHomePage(WebDriver driver) {
		super(driver);
	}
	
	public void url() {
		driver.get("https://www.google.com/");
	}
	
	public void clickSearch() {
		typeOnElement(searchElement, "selenium");
	}
	

	

}
