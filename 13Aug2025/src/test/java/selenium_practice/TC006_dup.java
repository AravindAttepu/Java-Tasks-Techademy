package selenium_practice;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
import java.util.Set;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC006_dup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/window");
		 driver.manage().window().setSize(new Dimension(1550, 830));
//		driver.findElement(By.linkText("Desktops")).click();
//		driver.findElement(By.linkText("Mac (1)")).click();
//		WebElement sortElement= driver.findElement(By.id("input-sort"));
//		Select sortSelect= new Select(sortElement);
//		//sortSelect.selectByIndex(5);
//		List<WebElement> elemeList= sortSelect.getOptions();
//		for(int i=0;i<elemeList.size();i++)
//		{
//			System.out.println(elemeList.get(i).getText());
//		}
//		
		 
		 
		 
//		 driver.findElement(By.id("accept")).click();
//		 Alert accAlert= driver.switchTo().alert();
//		 System.out.println(accAlert.getText());
//		 accAlert.accept();
//		 
//		 driver.findElement(By.id("confirm")).click();
//		 Alert cAlert= driver.switchTo().alert();
//		 System.out.println(cAlert.getText());
//		 cAlert.dismiss();
//		 
//		 driver.findElement(By.id("prompt")).click();
//		 Alert pAlert= driver.switchTo().alert();
//		 System.out.println(pAlert.getText());;
//		 pAlert.sendKeys("Aravind");
//		 pAlert.accept();
		 
		 
		 
//		 driver.findElement(By.id("home")).click();
//		 String pwindow= driver.getWindowHandle();
//		 System.out.println(pwindow);
//		 System.out.println(driver.getCurrentUrl());

		 
		 driver.findElement(By.id("multi")).click();
		 Set<String> pwindow= driver.getWindowHandles();
		 for(String string: pwindow)
		 {
			 driver.switchTo().window(string);
		 System.out.println(driver.getCurrentUrl());
		 }
	}

}
