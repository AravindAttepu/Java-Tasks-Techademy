package Pageom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import selenium_.*;

public class PageObject1 {
	WebDriver driver;
	
	
	public PageObject1(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	//By menui=By.linkText("Desktops");
	
		@FindBy(linkText = "Desktops")
		WebElement menui;
		//By indexele=By.name("password");
		//By btn=By.xpath("//div[@class='button-group']//button");
		
		@FindBy(xpath = "div[@class='button-group']//button")
		WebElement btn;
	
	public void selectmenu(String menuitem)
	{
		//driver.findElement(menui).click();
		menui.click();
		 Reporter.log("Clicked on Desktops menu", true);
	}
	public void selectindex(int ind)
	{
		WebElement sortele = driver.findElement(By.xpath("//select[@id='input-sort']"));
	      Select sortSelect = new Select(sortele);
	      sortSelect.selectByIndex(ind);
	      Reporter.log("Applied sorting with index: " + ind, true);

		//driver.findElement(indexele);
	}
	public void clickbtn()
	{
		//driver.findElement(btn).click();
		btn.click();
		 Reporter.log("Clicked on Add to Cart button", true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
