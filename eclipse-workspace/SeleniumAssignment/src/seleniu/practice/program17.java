package seleniu.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class program17 {
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		driver.findElement(By.id("fname")).sendKeys("Manish Kumar Tiwari");
		driver.findElement(By.id("fname")).sendKeys(Keys.CONTROL + "a");
		driver.findElement(By.id("fname")).sendKeys(Keys.CONTROL + "c");
		driver.findElement(By.id("fname")).sendKeys(Keys.CONTROL + "v");
		driver.findElement(By.id("lname")).sendKeys("Manish Kumar Tiwari");
		driver.findElement(By.id("email")).sendKeys("Manish Kumar Tiwari");
		driver.findElement(By.id("password")).sendKeys("Manish Kumar Tiwari");
		
		
		
		
		
	}

}
