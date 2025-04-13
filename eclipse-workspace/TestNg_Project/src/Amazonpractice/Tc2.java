package Amazonpractice;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc2  extends Launch_Quit {
	
	@Test
	public void Login_Search_Pen_Logout()
	{
		    WebElement elem= getDriver().findElement(By.id("twotabsearchtextbox"));
			elem.sendKeys("Shoes");
			elem.sendKeys(Keys.ENTER);
			WebElement shoe=getDriver().findElement(By.xpath("(//div[@class='a-section a-spacing-base a-text-center'])[1]"));
			shoe.click();
			//Thread.sleep(3000);
			Set<String> handle =getDriver().getWindowHandles();
			Iterator<String> ite =handle.iterator();
			String parent =ite.next();
			String child =ite.next();
			getDriver().switchTo().window(child);
			WebElement ele =getDriver().findElement(By.id("add-to-cart-button"));
			ele.click();
	}
}
