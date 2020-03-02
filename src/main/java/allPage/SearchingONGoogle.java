package allPage;

import org.openqa.selenium.WebDriver;

public class SearchingONGoogle extends Generic{
	String searchSelenium = "//span[text()='Selenium']";
 
	public SearchingONGoogle(WebDriver driver) {
		super(driver);
		
	}
	
	public String seleniumText() {
		return getText(searchSelenium);
	}
	
	

}
