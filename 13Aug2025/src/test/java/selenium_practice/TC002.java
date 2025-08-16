package selenium_practice;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC002 {
	static WebDriver driver=new ChromeDriver();
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		
	
		bygoogle();
		Thread.sleep(2000 + new Random().nextInt(3000));
		byduck();
		
		
		
	}
	static void bygoogle() throws InterruptedException
	{
		
	driver.get("https://www.google.com/");
	Thread.sleep(2000 + new Random().nextInt(3000));
	WebElement element= driver.findElement(By.name("q"));
	element.sendKeys("https://www.instagram.com/tech_bachelor/");
	element.sendKeys(Keys.ENTER);

	}
	
	static void byduck() throws InterruptedException
	{
		driver.get("https://api.duckduckgo.com/");
		Thread.sleep(2000 + new Random().nextInt(3000));
		WebElement element= driver.findElement(By.name("q"));
		element.sendKeys("https://www.instagram.com/tech_bachelor/");
		WebElement btn= driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		btn.click();
	}
	

}
