package seleniu.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program19 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement a1 = driver.findElement(By.name("q"));
		a1.sendKeys("books");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='_1sFryS _2x2Mmc _3ofZy1']ul/li"));
	}
}
