package ques9;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTest;

import org.openqa.selenium.io.FileHandler;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.ScreenShot;
import utilities.ReportManager;

public class test1 extends BaseTest {

	  @Test
	  public void f() throws IOException {
		  try {
		  driver.get("https://www.wikipedia.org/");
		 test= ReportManager.createTest("Screenshot", "take screenshot of webpage");
		 ScreenShot sr= new ScreenShot(driver);
		 test.info(sr.takeshot());
		  }
		  catch (Throwable e) {
			// TODO: handle exception
			  logFailure(e, "screenshot failure");
		}
	  }
	  
	 
}
