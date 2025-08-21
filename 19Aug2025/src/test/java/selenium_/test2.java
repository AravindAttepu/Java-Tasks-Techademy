package selenium_;

import java.time.Duration;
import Pageom.PageObject2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;


import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class test2 {
	WebDriver driver;
	
	
@Parameters({"browser","n","s"})
  @Test
  public void f(String browser,int n,String s) {

	if(browser.equalsIgnoreCase("CHROME"))
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		 
	}
	else if(browser.equalsIgnoreCase("FIREFOX"))
	{
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}
	else if (browser.equalsIgnoreCase("EDGE"))
	{
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}
	PageObject2 object1= new PageObject2(driver);
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
	  driver.get("https://tutorialsninja.com/demo/index.php?");
      Reporter.log("Opened TutorialsNinja homepage", true);

      object1.selectmenu("Desktops");
    
     

      driver.findElement(By.linkText(s)).click();
      Reporter.log("Selected option: " + s, true);

      object1.selectindex(n);
    
      object1.clickbtn();
     
object1.verifyheader("Mac");
      // Assertion Example
      
      // Search functionality
      WebElement searchele = driver.findElement(By.xpath("//input[@type='text']"));
      searchele.clear();
      searchele.sendKeys("Mobile");
      Reporter.log("Entered 'Mobile' in search box", true);

      WebElement button = wait.until(ExpectedConditions.elementToBeClickable(
              By.xpath("//span[@class='input-group-btn']/button[@type='button']")));
      button.click();
      Reporter.log("Clicked on Search button", true);

      driver.findElement(By.xpath("//input[@placeholder='Keywords']")).clear();
      driver.findElement(By.xpath("//input[@id='description']")).click();
      driver.findElement(By.xpath("//input[@id='button-search']")).click();
      Reporter.log("Performed advanced search", true);

      driver.findElement(By.xpath("//input[@type='text']")).clear();
      driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Monitors");
      Reporter.log("Searched for 'Monitors'", true);
  }
}
