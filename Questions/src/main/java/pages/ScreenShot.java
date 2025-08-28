package pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
WebDriver driver=null;

public ScreenShot(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver= driver;
	
}
	public String takeshot() throws IOException
	{
		TakesScreenshot ts= (TakesScreenshot) driver;
		File src= ts.getScreenshotAs(OutputType.FILE);
		File dest= new File("question 9.png");
		FileHandler.copy(src, dest);
		return dest.getAbsoluteFile().toString();
	}
}
