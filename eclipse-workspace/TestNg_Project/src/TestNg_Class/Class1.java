package TestNg_Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class1 
{
	@Test
	public void method1() throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement check = driver.findElement(By.name("q"));
		check.sendKeys("India");
		Thread.sleep(1000);
        List<WebElement> result =  driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
        int count_auto = result.size();
        System.out.println(count_auto);
        Thread.sleep(3000);
        result.get(count_auto-3).click();
	}
}
