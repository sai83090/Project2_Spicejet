package Assignment_145;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_1 {
	
	@Test
	public void Login_Amazon()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement Element = driver.findElement(By.xpath("//div[@class=\"a-section aok-relative s-image-square-aspect\"][1]"));
		Element.click();
		
	}

}
