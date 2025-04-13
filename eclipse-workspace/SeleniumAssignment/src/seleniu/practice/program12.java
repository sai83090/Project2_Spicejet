package seleniu.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class program12 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("searchDropdownBox")).click();
		driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ENTER);
		
		
		
		
		}

}
