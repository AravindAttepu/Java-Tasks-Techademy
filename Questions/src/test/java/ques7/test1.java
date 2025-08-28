package ques7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;

import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.tables;
import utilities.ReportManager;

public class test1  extends BaseTest{
	
  @Test
  public void f() {
	  driver.get("https://the-internet.herokuapp.com/tables");
	  test = ReportManager.createTest("tables", "fetch rows from tables1");
	tables tables= new tables(driver);
	
	for (String iterable_element : tables.getdata()) {
		test.info(iterable_element);
	}
  }
  
  
}
