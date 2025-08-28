package ques2;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import pages.LoginPage;
import utilities.ReportManager;

public class test1 extends BaseTest {
	

@Test
  public void f() {
	 test = ReportManager.createTest("Login Test", "Verify User Credentials");
	  driver.get("https://the-internet.herokuapp.com/login");
	  
	  LoginPage loginPage= new LoginPage(driver);
	  loginPage.login("tomsmith", "SuperSecretPassword!");
	 String msg = loginPage.message();
	  
	 assertTrue(msg.contains("You logged into a secure area!"));
	 test.pass("User verified successfully");
	
  }
  

  
  
 
}
