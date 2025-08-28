package ques3;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Amazon;
import utilities.ReportManager;

public class test1 extends BaseTest {
	
	
  @Test
  public void f() throws Throwable {
	  try
	  {
	  test = ReportManager.createTest("Amazon", "Print first 5 items");
	  driver.get("https://www.amazon.in/");
	  
	  Amazon amazon= new Amazon(driver);
	  int i=0;
	  for (String iterable_element : amazon.itemlist()) {
		 
		test.info(iterable_element);
		i++;
	}
	 assertTrue(i==5,"retrieve elements failed");
	  }
	  catch (Throwable e) {
		// TODO: handle exception
		  logFailure(e, "ques3");
	}

	
	
	  }
	 
}

