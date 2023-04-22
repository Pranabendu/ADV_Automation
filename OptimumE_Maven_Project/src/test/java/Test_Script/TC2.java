package Test_Script;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Generic.Excel;
import Generic.Launch;
import Pom.Pom_HomePage;

public class TC2 extends Launch{
	
	@Test
	void second() throws EncryptedDocumentException, IOException, InterruptedException {
		
		String act = "Search for car - Kolkata, Bhārat1";
		
		String data1 = Excel.fetch(8, 0);
		String data2 = Excel.fetch(8, 1);
		
		Pom_HomePage p1 = new Pom_HomePage(driver);
		p1.whatTextField(data1);
		p1.whereTextField(data2);
		p1.findButton();
		String exp = driver.getTitle();
		SoftAssert s1 = new SoftAssert();
		s1.assertEquals(act, exp);
		
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		s1.assertAll();
	}
}
