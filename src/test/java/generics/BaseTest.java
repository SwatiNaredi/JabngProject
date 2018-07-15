package generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements AutoConst{

	public static WebDriver driver;
	
	@BeforeMethod
	public void preCondition() {
		//System.setProperty(GECKO_KEY, GECKO_VALUE);
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		//driver = new FirefoxDriver();
		driver = new ChromeDriver();
		driver.get("https://www.jabong.com/");
	}
	
	@AfterMethod
	public void postCondition() {
		driver.close();
	}

}
