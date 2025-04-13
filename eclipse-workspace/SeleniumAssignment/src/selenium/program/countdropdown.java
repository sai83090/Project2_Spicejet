package selenium.program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class countdropdown {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement s1 = driver.findElement(By.id("Skills"));
		Select sop = new Select(s1);
		sop.selectByIndex(1);
		List<WebElement> s2 = sop.getOptions();
		int count = s2.size();
		System.out.println(count);

	}

}
