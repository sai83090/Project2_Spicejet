package TestNg_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class citizes{
	@Test(dataProvider="listofcity")
	public void method1(String input) throws  InterruptedException
	{
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	WebElement check = driver.findElement(By.name("q"));
	check.sendKeys(input);
	check.sendKeys(Keys.ENTER);
	System.out.println(driver.getTitle());
	driver.quit();

}
     @DataProvider(name="listofcity")
     public Object[][] method1()
{
	return new Object[][] {{"Bangalore"},{"mumbai"},{"Andhra Pradesh"},{"pune"},{"hyderabad"}};
}

}

