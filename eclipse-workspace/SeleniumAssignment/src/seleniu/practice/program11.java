package seleniu.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class program11 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("namburi.yashwanth@gmail.com");
		driver.findElement(By.name("email")).sendKeys(Keys.CONTROL+"a");
		driver.findElement(By.name("email")).sendKeys(Keys.CONTROL+"c");
		driver.findElement(By.name("pass")).sendKeys(Keys.CONTROL+"v");
		driver.findElement(By.name("login")).click();		
	}
}
