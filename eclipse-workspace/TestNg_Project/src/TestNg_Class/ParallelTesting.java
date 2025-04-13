package TestNg_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTesting {
	WebDriver driver;
@Test
@Parameters("browser")
public void Launching_Browser(String name_of_browser)
{
	if(name_of_browser.equals("chrome"))
	{
		driver = new ChromeDriver();
	}
	if(name_of_browser.equals("Edge"))
	{
		driver = new EdgeDriver();
	}
	if(name_of_browser.equals("FireFox"))
	{
		driver = new FirefoxDriver();
	}
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	WebElement element = driver.findElement(By.name("q"));
	element.sendKeys("India");
	element.sendKeys(Keys.ENTER);
}
}
