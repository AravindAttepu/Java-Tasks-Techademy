package ques5;


import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Alerts;
import utilities.ReportManager;

public class test1 extends BaseTest {
	
  @Test
  public void f() {
	  try {
	  test = ReportManager.createTest("Alerts", "Accepting the Alert");
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	  Alerts alerts= new Alerts(driver);
	  String result= alerts.accept();
	  assertTrue("You successfully clicked an alert", result.contains("You successfully clicked an alert"));
  } catch (AssertionError ae) {
      test.fail("Assertion failed: " + ae.getMessage());
      throw ae; // rethrow so JUnit marks it as FAILED
  } catch (Exception e) {
      test.fail("Test failed with exception: " + e.getMessage());
      throw e; // rethrow for JUnit
  }
	  }
  
  
  
}
