package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_FaceBook_HomePage {
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement un;
	
	@FindBy(xpath = "//input[@id='pass']")
	private WebElement pwd;
	
	public Pom_FaceBook_HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void userNameTxt(String u)
	{
		un.sendKeys(u);
	}
	public void passWordTxt(String p)
	{
		pwd.sendKeys(p);
	}
}
