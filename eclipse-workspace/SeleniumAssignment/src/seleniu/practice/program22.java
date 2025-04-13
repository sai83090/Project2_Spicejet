package seleniu.practice;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class program22 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("Shoe");
		driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
		driver.findElement(By.xpath("(//div[@class=\"a-section aok-relative s-image-tall-aspect\"])[30]")).click();
		Set<String> s1 = driver.getWindowHandles();
		ArrayList a1 =  new ArrayList(s1);
		System.out.println(a1.get(0));
		System.out.println(a1.get(1));
		driver.switchTo().window((String)a1.get(1));
	    driver.findElement(By.xpath("//input[@id=\"add-to-cart-button\"]")).click();
	
	
	}
	
	
	

}
