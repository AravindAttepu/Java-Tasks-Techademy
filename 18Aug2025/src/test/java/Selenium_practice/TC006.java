package Selenium_practice;

import org.testng.annotations.Test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC006 {

	@Test
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("aravindgfghgfgttepu@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Aravind@123");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		if(driver.getTitle().equals("My Account"))
		{
			driver.findElement(By.linkText("Components")).click();
			driver.findElement(By.linkText("Monitors (2)")).click();
			WebElement limitElement= driver.findElement(By.id("input-limit"));
			Select sortSelect= new Select(limitElement);
			sortSelect.selectByIndex(1);
			List<WebElement> items= driver.findElements(By.xpath("//div[@class='button-group']//button[@type='button']"));
			items.get(0).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@data-original-title=\"Add to Wish List\"]")).click();
			Thread.sleep(1000);
		WebElement wishliststatus= driver.findElement(By.cssSelector("div.alert.alert-success"));
		System.out.println();
		if("Success: You have added Apple Cinema 30\" to your wish list!".equals(wishliststatus.getText().replace('×', ' ').trim()))
		{
			System.out.println("Added to wishlist");
			driver.findElement(By.xpath("//input[@name=\"search\"]")).sendKeys("Mobile");
			driver.findElement(By.xpath("//span[@class=\"input-group-btn\"]//button[@type=\"button\"]")).click();
			driver.findElement(By.xpath("//input[@type='checkbox' and @name='description']")).click();
			driver.findElement(By.xpath("//input[@id=\"button-search\"]")).click();
			driver.findElements(By.xpath("//div[@class='caption']//a")).get(0).click();
			driver.findElement(By.xpath("//input[@name=\"quantity\"]")).clear();
			driver.findElement(By.xpath("//input[@name=\"quantity\"]")).sendKeys("3");
			
			driver.findElement(By.xpath("//button[@id=\"button-cart\"]")).click();
			Thread.sleep(5000);
			WebElement cartstatus = driver.findElement(By.cssSelector("div.alert.alert-success"));
			if("Success: You have added HTC Touch HD to your shopping cart!".equals(cartstatus.getText().replace('×', ' ').trim()))
			{
				System.out.println("Added to cart");
				driver.findElement(By.xpath("//div[@class=\"btn-group btn-block\"]//button")).click();
				driver.findElement(By.xpath("//p[@class=\"text-right\"]//a")).click();
				Thread.sleep(1000);
				if (driver.findElements(By.xpath("//tbody // td[@class=\"text-left\"]//a")).get(1).getText().equals("HTC Touch HD"))
				{
					System.out.println("item verified");
					
					
					driver.findElement(By.xpath("//div[@class=\"pull-right\"]//a"));
					Thread.sleep(1000);
					if(driver.findElement(By.cssSelector("div.alert.alert-danger")).getText().equals("Products marked with *** are not available in the desired quantity or not in stock!"))
					{
						System.out.println("Item not in stock");
					}
					else {
						System.out.println("Item checkedout");
						driver.findElement(By.linkText("My Account")).click();
						driver.findElement(By.linkText("Logout")).click();
						Thread.sleep(1000);
						if(driver.findElement(By.xpath("//div[@id=\"content\"]//h1")).getText().equals("Account Logout"))
						{
							System.out.println("Account logged out");
							driver.findElement(By.xpath("//div[@class=\"pull-right\"]")).click();
						}
						else {
							System.out.println("erorr in logout");
						}
						
					}

				}
				else {
					System.out.println("item not verified");
				}
				
			}
			else {
				
			}
			}
		
		else {
			System.out.println("error in wishlist");
		}
		
	}
		
		else {
			System.out.println("Login failed");
		}
		
		
		
		
	}

}
