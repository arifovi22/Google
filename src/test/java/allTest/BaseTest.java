package allTest;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import allPage.GoogleHomePage;
import allPage.SearchingONGoogle;

public class BaseTest {
	private static BaseTest instance;
	WebDriver driver;
	GoogleHomePage homePage;
	SearchingONGoogle googleSearching;
	
	private BaseTest() {
		
	}
	
	public WebDriver getDriver(String driverValue) {
		if(driver == null)
			if(driverValue.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Arif\\eclipse extend project\\Google\\Browser\\chromedriver.exe");
		driver = new ChromeDriver();
		
		} else if(driverValue.contains("firefox")) {
			System.setProperty("webdriver.gecko.driver", 
					"C:\\Users\\Arif\\eclipse extend project\\Google\\Browser\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		
		return driver;
	}
	public static BaseTest getInstance() {
		if(instance == null)
			instance = new BaseTest();
		return instance;
	}
	
	public GoogleHomePage getHomePage() {
		if (homePage == null) 
			homePage = new GoogleHomePage(driver);
		return homePage;
		
	}
	public SearchingONGoogle getGoogleSearch() {
		if (googleSearching == null) 
			googleSearching = new SearchingONGoogle(driver);
		return googleSearching;
		
	}
	

}
