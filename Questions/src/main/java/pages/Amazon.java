package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.source.tree.CatchTree;

public class Amazon {
	
	WebDriver driver;
	By h4ele= By.tagName("h4");
	By dupbtn= By.xpath("//button");
	By Searchbar = By.xpath("//input[@id='twotabsearchtextbox']");
	By searchedlist= By.xpath("//div[@class='a-section']//h2");
	
	public Amazon(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String[] itemlist() {
		 String[] res= new String[5];
		try {
			if(driver.findElement(h4ele).isDisplayed())
			{
				driver.findElement(dupbtn).click();
			}
			
		}
		catch(Exception e)
		{
			System.out.println("exception caught");
		}
		
		driver.findElement(Searchbar).sendKeys("laptop",Keys.ENTER);
		
		new WebDriverWait(driver, Duration.ofSeconds(10))
        .until(ExpectedConditions.visibilityOfElementLocated(searchedlist));
		
		List<WebElement> productList= driver.findElements(searchedlist);
		 if(productList.size()==0)
		 {
			 return res;
		 }
		  for (int i=0;i<5;i++) {
			
			 res[i]=productList.get(i).getText();
		}
		  return res;
	}
	


}
