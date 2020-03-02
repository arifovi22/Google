package allTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleSearchTest {
	BaseTest instance;
	
	@Test
	public void searchTest() {
		instance = BaseTest.getInstance();
		instance.getDriver("chrome");
		instance.getHomePage().url();
		instance.getHomePage().clickSearch();
	String text = instance.getGoogleSearch().seleniumText();
	
		Assert.assertEquals(text, "Selenium");
		instance.driver.close();
		
	}

}
