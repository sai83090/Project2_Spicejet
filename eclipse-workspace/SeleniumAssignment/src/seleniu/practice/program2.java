package seleniu.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class program2 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("namburi.yashwanth@gamil.com");
		driver.findElement(By.id("pass")).sendKeys("1234546789");
		driver.findElement(By.name("login")).click();
	}

}
