package selenium.program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktext {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Links of the Page"+ links.size());
		for(int i=0;i<=links.size()-1;i++) {
			WebElement a = links.get(i);
			String Text_message = a.getText();
			System.out.println(Text_message);
		}
	}
}