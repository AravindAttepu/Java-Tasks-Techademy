package ques1;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.sql.DriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ReportManager;

public class test1 extends BaseTest {
	WebDriver driver=null;
  @Test
  public void f() throws IOException {
	  test = ReportManager.createTest("Google Title Test", "Verify Google homepage title");

      try {
          driver.get("https://www.google.com");
          test.info("Navigated to Google");

          String title = driver.getTitle();
          test.info("Page title: " + title);

          assertTrue("Title does not contain Google", title.contains("Google"));
          test.pass("Google title verified successfully");

      } catch (Throwable e) {
          logFailure(e, "GoogleTestFail");
      }
	  
  }
  
  @BeforeMethod
  public void  BeforeMethod()
  {
	  driver= new ChromeDriver();
	 WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
}
  
  @org.testng.annotations.AfterMethod
  public void AfterMethod() {
	  driver.quit();
  }
}
