package pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class windows {

	WebDriver driver=null;
	By windowbtn = By.xpath("//a[text()=\"Click Here\"]");
	
	public windows(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver= driver;
	}
	
	public String windowoperations()
	{
		  System.out.println(driver.getTitle());
		  String parentwindow= driver.getWindowHandle();
		driver.findElement(windowbtn).click();
		Set<String> windowSet=driver.getWindowHandles();
		for (String string : windowSet) {
			if(!parentwindow.equals(string)) {
				driver.switchTo().window(string);
			}
		}
		return driver.getTitle();
		
	}
}
