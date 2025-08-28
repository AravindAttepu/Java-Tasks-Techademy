package pages;



import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	
	WebDriver driver;
	By dropdownBy= By.xpath("//select");
	
	public dropdown(WebDriver driver) {
		this.driver = driver;
	}
	
	public String selectdropdown()
	{
		 WebElement dropdown= driver.findElement(dropdownBy);
		  Select itemSelect= new Select(dropdown);
		  itemSelect.selectByIndex(2);
		  return itemSelect.getFirstSelectedOption().getText();
	}

}
