package Generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	
	public static void take(WebDriver driver) throws IOException
	{
		Date d1 = new Date();
		String st = d1.toString();
		String fin = st.replace(":", "-");
		
		TakesScreenshot t1 = (TakesScreenshot) driver;
		File temp = t1.getScreenshotAs(OutputType.FILE);
		File f1 = new File("./photos/"+fin+".png"); 
		FileHandler.copy(temp, f1);
		
	}
}
