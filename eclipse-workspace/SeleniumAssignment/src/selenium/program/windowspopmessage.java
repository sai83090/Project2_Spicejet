package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowspopmessage {

	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://grotechminds.com/registration/");
	driver.manage().window().maximize();
	WebElement e1 = driver.findElement(By.id("file"));
	e1.sendKeys("C:\\Users\\HP\\OneDrive\\Desktop\\Resume\\Manual Interview Questions June Updated.pdf");
	
	}

}
