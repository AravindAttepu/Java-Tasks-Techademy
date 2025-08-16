package selenium_practice;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;

public class Task5_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.automationpractice.pl/index.php?");
		String title= driver.getTitle();
		System.out.println(title);
		Thread.sleep(3000);
		//WebElement register = driver.findElement(By.linkText("Register"));
		//driver.findElement(By.xpath("//li[text()='Register']")).click();
		//register.click();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
//		driver.findElement(By.name("FirstName")).sendKeys("Admin");
//		driver.findElement(By.name("LastName")).sendKeys("admin123");
//		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

	}

}
