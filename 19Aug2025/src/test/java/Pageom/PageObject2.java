package Pageom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import selenium_.*;

public class PageObject2 {
	WebDriver driver;
	
	
	public PageObject2(WebDriver driver)
	{
		this.driver= driver;
	}
	
	
	By menui=By.linkText("Desktops");
	
	
	By indexele=By.name("password");
	By btn=By.xpath("//div[@class='button-group']//button");
	
	
	public void selectmenu(String menuitem)
	{
		driver.findElement(menui).click();
		//menui.click();
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
		driver.findElement(btn).click();
		//btn.click();
		 Reporter.log("Clicked on Add to Cart button", true);
	}
	public void verifyheader(String h1)
	{
		String header = driver.findElement(By.xpath("//div[@id='content']/h2")).getText();
	      Assert.assertEquals(header, h1, "Category header mismatch!");
	      Reporter.log("Verified header text: " + header, true);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
