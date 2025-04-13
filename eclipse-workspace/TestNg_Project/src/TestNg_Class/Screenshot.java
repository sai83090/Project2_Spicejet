package TestNg_Class;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Screenshot {
	
	@Test
	public void screen() throws IOException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().minimize();
		TakesScreenshot s1 =  driver;
		File source = s1.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\HP\\eclipse-workspace\\TestNg_Project\\Screenshot\\yashwanth.png");
		FileUtils.copyFile(source, destination);
	}
}
