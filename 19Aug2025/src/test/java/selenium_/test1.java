package selenium_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import Pageom.PageObject1;
import Pageom.PageObject2;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class test1 {
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
	PageObject1 object1= new PageObject1(driver);
		driver.manage().window().maximize();
		 Reporter.log("Starting test with sort index: " + n + " and product: " + s, true);

	      driver.get("https://tutorialsninja.com/demo/index.php?");
	      Reporter.log("Navigated to homepage", true);

	      object1.selectmenu("Desktops");
	      
	      

	      driver.findElement(By.linkText(s)).click();
	      Reporter.log("Selected option: " + s, true);

	      object1.selectindex(n);
	    
	      object1.clickbtn();
	   
	      Reporter.log("Test completed successfully for product: " + s, true);
  }
}
