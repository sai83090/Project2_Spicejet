package TestNg_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class4 {
	@Test
	public void method4()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement firstname = driver.findElement(By.id("//input[@id='fname']"));
		boolean checking_firstname =   firstname.isDisplayed();
		if(checking_firstname==true)
		{
			firstname.sendKeys("yashwanth");
		}
		else
		{
			System.out.println("Do Nothing");
		}
	}

}
