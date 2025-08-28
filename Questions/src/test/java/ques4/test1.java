package ques4;


import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import org.junit.validator.PublicClassValidator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.dropdown;
import utilities.ReportManager;

public class test1 extends BaseTest {
	
  @Test
  public void f() {
	  test = ReportManager.createTest("DropDown", "Select 2nd dropdown element");
	  driver.get("https://www.selenium.dev/selenium/web/web-form.html");
	dropdown drop= new dropdown(driver);
	String result= drop.selectdropdown();
	test.info("dropdown called");
	assertTrue("Two", result.contains("Two"));
	test.pass("test passed");
  }

 
  
  
}
