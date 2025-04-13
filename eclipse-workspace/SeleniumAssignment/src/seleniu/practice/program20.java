package seleniu.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program20 {
	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/HP/OneDrive/Documents/learningHTML_073920.html");
		driver.manage().window().minimize();
		WebElement disabled = driver.findElement(By.id("121"));
		boolean Check_textfields = disabled.isEnabled();
		if(Check_textfields==true && disabled.isDisplayed()==true)
		{
			disabled.sendKeys("232");
		}
		else 
		{
			System.out.println("Do Nothing");
		}
		
	
	}

}	
		
		
	