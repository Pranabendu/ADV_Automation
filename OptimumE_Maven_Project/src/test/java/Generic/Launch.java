package Generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launch {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void open() 
	{
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://106.51.87.42:9003/");
	}
	
	@AfterMethod
	public void close(ITestResult it) throws IOException
	{
		if (ITestResult.FAILURE == it.getStatus()) {
			Screenshot.take(driver);
		}
		
		driver.close();
		
		
	}
}
