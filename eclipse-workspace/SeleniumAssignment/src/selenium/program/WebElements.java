package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement googleSearch = driver.findElement(By.name("q"));
		googleSearch.sendKeys("India");
		googleSearch.sendKeys(Keys.ENTER);
	}
}
