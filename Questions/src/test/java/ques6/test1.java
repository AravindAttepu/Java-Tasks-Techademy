package ques6;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertTrue;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.internal.annotations.TestAnnotation;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.checkboxes;
import utilities.ReportManager;

public class test1 extends BaseTest {
	
  @Test
  public void f()  {
	//input
	  test = ReportManager.createTest("Checkboxes", "Select all checkboxes");
	  driver.get("https://the-internet.herokuapp.com/checkboxes");
	  checkboxes checkboxes = new checkboxes(driver);
	 String resultString = checkboxes.selectboxes();
	 if(resultString.equals("pass"))
	 {
		test.pass("all checkboxes selectd");
		
	 }
	 else {
test.fail("Something went wrong");
	}
	  
	  
  }

  
}

