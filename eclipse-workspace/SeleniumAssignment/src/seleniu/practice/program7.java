package seleniu.practice;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class program7 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("United Arab Emirates")).click();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Kingdom")).click();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("States")).click();
		driver.navigate().back();

	}

}
