package Test_Script;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Generic.Launch;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC1 extends Launch{
	@Test
	void first() throws AWTException, InterruptedException {
		String exp = "Lara Classified - Qspiders all in one";
		
		
		String act = driver.getTitle();
		assertEquals(true, false);
		
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_ALT);
		r1.keyPress(KeyEvent.VK_SPACE);
		r1.keyRelease(KeyEvent.VK_ALT);
		r1.keyRelease(KeyEvent.VK_SPACE);
		
		Thread.sleep(2000);
		
		r1.keyPress(KeyEvent.VK_N);
		r1.keyRelease(KeyEvent.VK_N);
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
	
	}
}
