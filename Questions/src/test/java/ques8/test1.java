package ques8;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.windows;
import utilities.ReportManager;

public class test1 extends BaseTest {

	  @Test
	  public void f() throws IOException {
		  try {
			 driver.get("https://the-internet.herokuapp.com/windows");
		  test= ReportManager.createTest("windows", "multiple windows handling");
		windows window = new windows(driver);
		String result=window.windowoperations();
		  assertTrue("window switch failes", result.contains("New Window"));
		  test.pass("drivet switched to another tab");

			} catch (Throwable e) {
				// TODO: handle exception
				logFailure(e, "windows switch fail");
			}
			 
	  }
	  
	 
}
