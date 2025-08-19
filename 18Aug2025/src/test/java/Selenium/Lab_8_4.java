/**
 * 
 */
package Selenium;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 */
public class Lab_8_4 {
	static WebDriver driver;
    static WebDriverWait wait;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		  WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        driver.manage().window().maximize();
	      //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		 driver.quit();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		driver.get("https://tutorialsninja.com/demo/index.php?");
		   driver.findElement(By.linkText("Desktops")).click();
	        driver.findElement(By.linkText("Mac (1)")).click();

	        WebElement sortele = driver.findElement(By.id("input-sort"));
	        Select sortSelect = new Select(sortele);
	        sortSelect.selectByIndex(1);

	        driver.findElement(By.xpath("//div[@class='button-group']//button")).click();

	        // Assertion
	        assertEquals("Mac", driver.findElement(By.xpath("//div[@id='content']/h2")).getText());

	        // Search workflow
	        WebElement searchele = driver.findElement(By.xpath("//input[@type='text']"));
	        searchele.clear();
	        searchele.sendKeys("Mobile");

	        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(
	                By.xpath("//span[@class='input-group-btn']/button[@type='button']")));
	        button.click();

	        driver.findElement(By.xpath("//input[@placeholder='Keywords']")).clear();
	        driver.findElement(By.id("description")).click();
	        driver.findElement(By.id("button-search")).click();
	        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Monitors");
	}

}
