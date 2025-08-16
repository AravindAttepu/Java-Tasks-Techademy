package selenium;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC005 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
	    driver.manage().window().setSize(new Dimension(1550, 830));
	   // assertThat(driver.getTitle(), is("Your Store"));
	    driver.findElement(By.linkText("My Account")).click();
	    driver.findElement(By.linkText("Register")).click();
	    Thread.sleep(1000);
	    if(driver.findElement(By.xpath("//div[@id='content']/h1")).getText().equals("Register Account")) 
	    {
	    driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	    Thread.sleep(2000);
	    if(driver.findElement(By.cssSelector(".alert.alert-danger")).getText().equals("Warning: You must agree to the Privacy Policy!"))
	    {
	    	System.out.println(driver.findElement(By.cssSelector(".alert.alert-danger	")).getText());
	    }
	    driver.findElement(By.id("input-firstname")).click();
	    driver.findElement(By.id("input-firstname")).sendKeys("qwertyuiopasdfghjklzxcvbnmqwertyui");
	    driver.findElement(By.cssSelector(".btn-primary")).click();
	    Thread.sleep(2000);
	    if(driver.findElement(By.cssSelector("#input-firstname + .text-danger")).getText().equals("First Name must be between 1 and 32 characters!"))
	    		{
	    	System.out.println(driver.findElement(By.cssSelector("#input-firstname + .text-danger")).getText());
	    	 driver.findElement(By.id("input-firstname")).clear();
	    		}
	    		
	    driver.findElement(By.id("input-lastname")).click();
	    driver.findElement(By.id("input-lastname")).sendKeys("qwertyuiopasdfghjklzxcvbnmqwertyui");
	    driver.findElement(By.id("input-firstname")).click();
	    driver.findElement(By.id("input-firstname")).sendKeys("qwertyuiopasdfghjklzxcvbnmqwerty");
	    driver.findElement(By.cssSelector(".btn-primary")).click();
	    Thread.sleep(2000);
	    if(driver.findElement(By.cssSelector("#input-lastname + .text-danger")).getText().equals("Last Name must be between 1 and 32 characters!"))
	    {
	    	System.out.println(driver.findElement(By.cssSelector("#input-lastname + .text-danger")).getText());
	    	 driver.findElement(By.id("input-lastname")).clear();
	    }
	    
	    driver.findElement(By.id("input-lastname")).click();
	    driver.findElement(By.id("input-lastname")).sendKeys("qwertyuiopasdfghjklzxcvbnmqwe");
	    driver.findElement(By.id("input-email")).click();
//	    driver.findElement(By.id("input-email")).click();
	    driver.findElement(By.id("input-email")).sendKeys("aravindattepugmail.com");
	    driver.findElement(By.cssSelector(".btn-primary")).click();
	    Thread.sleep(2000);
	    if(driver.findElement(By.cssSelector("#input-email + .text-danger")).getText().equals("E-Mail Address does not appear to be valid!"))
	    {
	    	System.out.println(driver.findElement(By.cssSelector("#input-email + .text-danger")).getText());
	    	 driver.findElement(By.id("input-email")).clear();
	    }
	    
//	    driver.findElement(By.id("input-email")).click();
	    driver.findElement(By.id("input-email")).click();
	    driver.findElement(By.id("input-email")).sendKeys("aravindgfghgfgttepu@gmail.com");
	    driver.findElement(By.cssSelector(".btn-primary")).click();
	    driver.findElement(By.id("input-telephone")).sendKeys("1234567890");
	    driver.findElement(By.cssSelector(".btn-primary")).click();
	    driver.findElement(By.id("input-password")).click();
	    driver.findElement(By.id("input-password")).sendKeys("Aravind@123");
	 
	    driver.findElement(By.id("input-confirm")).sendKeys("Aravind@123");
	    driver.findElements(By.name("newsletter")).get(0).click();
	    driver.findElement(By.name("agree")).click();
	    driver.findElement(By.cssSelector(".btn-primary")).click();
	    
	    
	    
	    Thread.sleep(3000);
	    if(driver.findElements(By.tagName("h1")).get(1).getText().equals("Your Account Has Been Created!"))
	    {
	    	 driver.findElement(By.linkText("Continue")).click();
	    	    driver.findElement(By.linkText("View your order history")).click();
	    }
	    else {
	    	{
	    		System.out.println("Soething wrong account not created");
	    	}
		}
	    }
	}

}
