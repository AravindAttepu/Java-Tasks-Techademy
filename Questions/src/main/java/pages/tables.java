package pages;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tables {
	
	WebDriver driver;
	By table1= By.id("table1");
	By rows = By.xpath(".//tbody//tr");
	By firstname= By.xpath(".//td[2]");
	By lastname= By.xpath(".//td[1]");
	By email = By.xpath(".//td[3]");
	
	public tables(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver= driver;
	}
	
	public List<String> getdata()
	{
		
		WebElement table= driver.findElement(table1);
		
		List<WebElement> tablerows= table.findElements(rows);
		String emailString=null;
		List<String> list= new ArrayList<>();
		  for (WebElement webElement : tablerows) {
			  list.add(webElement.findElement(firstname).getText()+" "+webElement.findElement(lastname).getText());
			  if(webElement.findElement(firstname).getText().equals("Jason"))
				{
					
					emailString=  webElement.findElement(email).getText();
				}
		  }
		  list.add(emailString);
		  return list;
		  }
	}


