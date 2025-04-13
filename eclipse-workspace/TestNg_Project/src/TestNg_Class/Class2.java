package TestNg_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class2 {
	
	@Test
	public void method2() throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/HP/OneDrive/Documents/learningHTML1.html");
		driver.manage().window().maximize();
		WebElement checkBox = driver.findElement(By.xpath("(//html/body/input)[6]"));
        checkBox.click();
        Thread.sleep(1000);
        if(checkBox.isSelected()==true)
        {
        	System.out.println("Click on the Submit");
        }
        else
        {
        	  checkBox.click();
        }

	}

}
