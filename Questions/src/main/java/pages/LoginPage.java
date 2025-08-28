package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	By username= By.id("username");
	By password = By.id("password");
	By btn= By.xpath("//button");
	By msg = By.xpath("//div[@id='flash']");


	public  LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void login(String user, String pass)
	{
		driver.findElement(username).sendKeys(user);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(btn).click();
	}
	
	public String message()
	{
		return driver.findElement(msg).getText().replace("×", "").trim();
		
	}
	
	
}
