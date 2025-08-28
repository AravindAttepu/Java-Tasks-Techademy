package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class checkboxes {

	WebDriver driver;
	By checkboxesBy = By.xpath("//input");
	public checkboxes(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver= driver;
	}
	public String selectboxes()
	{
		List<WebElement> checkboxesElements= driver.findElements(checkboxesBy);
		for (WebElement webElement : checkboxesElements) {
			if(!webElement.isSelected())
			{
				webElement.click();
			}
		}
		for (WebElement webElement : checkboxesElements) {
			if(!webElement.isSelected())
			{
				return "fail";
			}
		}
		return "pass";
	}
}
