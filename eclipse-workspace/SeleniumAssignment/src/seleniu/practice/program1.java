package seleniu.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class program1 {

	public static void main(String[] args) {
		ChromeDriver c1 = new ChromeDriver();
//		c1.get("https://www.amazon.in");
//		System.out.println(c1.getWindowHandle());
//		System.out.println(c1.getWindowHandles());
		c1.get("https://grotechminds.com/registration/");
		System.out.println(c1.getTitle());
		c1.findElement(By.id("Username")).sendKeys("Sai123");
		c1.findElement(By.id("fname")).sendKeys("Sai");
		c1.findElement(By.id("lname")).sendKeys("Yashwanth");	
	}
}
