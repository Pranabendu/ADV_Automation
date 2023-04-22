package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launch {
	
	public WebDriver driver;
	
	@BeforeMethod
	void open() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.fb.com");
	}
	
	@AfterMethod
	void closes() {
		driver.close();
	}
}
