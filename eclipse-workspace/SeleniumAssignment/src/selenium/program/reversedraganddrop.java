package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class reversedraganddrop {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		WebElement drop_1 = driver.findElement(By.id("drag7"));
		WebElement drag_1 = driver.findElement(By.id("div1"));
		Actions a1 = new Actions(driver);
		a1.dragAndDrop(drop_1, drag_1).perform();
	}
}


