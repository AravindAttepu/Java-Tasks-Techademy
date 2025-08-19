package Selenium_practice;

import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class jsexcevutor {
	 @Test
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		JavascriptExecutor jsExecutor=(JavascriptExecutor) driver;
		//jsExecutor.executeScript("alert('hai ')");
		jsExecutor.executeScript("window.scrollBy(0,500)");
	}
}
