package TestNg_Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Timeout {
	@Test(timeOut=10000)
	public void Method2() throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement check = driver.findElement(By.name("q"));
		check.sendKeys("India");
//		Thread.sleep(1000);
//		
	}

}
