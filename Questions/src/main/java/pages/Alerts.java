package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Alerts {
	
	
WebDriver driver;
By alertbtn= By.xpath("//button[@onclick='jsAlert()']");
By result = By.id("result");

public Alerts(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver= driver;
}

public String accept()
{
	driver.findElement(alertbtn).click();
	Alert dAlert=driver.switchTo().alert();
	  dAlert.accept();
	  return driver.findElement(result).getText();
	  
	
}

	
	
}
