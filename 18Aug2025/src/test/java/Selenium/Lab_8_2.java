package Selenium;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Lab_8_2 {
	WebDriver driver;
	WebDriverWait wait;
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
	  driver.get("https://tutorialsninja.com/demo/index.php?");
      Reporter.log("Opened TutorialsNinja homepage", true);

      driver.findElement(By.linkText("Desktops")).click();
      Reporter.log("Clicked on Desktops menu", true);

      driver.findElement(By.linkText(s)).click();
      Reporter.log("Selected option: " + s, true);

      WebElement sortele = driver.findElement(By.xpath("//select[@id='input-sort']"));
      Select sortSelect = new Select(sortele);
      sortSelect.selectByIndex(n);
      Reporter.log("Applied sorting with index: " + n, true);

      driver.findElement(By.xpath("//div[@class='button-group']//button")).click();
      Reporter.log("Clicked on Add to Cart button", true);

      // Assertion Example
      String header = driver.findElement(By.xpath("//div[@id='content']/h2")).getText();
      Assert.assertEquals(header, "Mac", "Category header mismatch!");
      Reporter.log("Verified header text: " + header, true);

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
  @BeforeMethod
  public void beforeMethod() {

	  WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			 wait = new WebDriverWait(driver, Duration.ofSeconds(10));

			driver.manage().window().maximize();
			 Reporter.log("Browser launched and maximized", true);
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
	  Reporter.log("Browser closed", true);
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
    	 new Object[] { 1, "Mac (1)" },
         new Object[] { 2, "Mac (1)"},
    };
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
