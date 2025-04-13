package seleniu.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class program28 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement w1 = driver.findElement(By.id("searchDropdownBox"));
		Select s1 = new Select(w1);
		s1.selectByVisibleText("All Categories");
		List<WebElement> result = s1.getOptions();
		int value = result.size();
		System.out.println(value);
	}
}
