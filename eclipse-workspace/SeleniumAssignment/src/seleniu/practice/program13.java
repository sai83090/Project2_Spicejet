package seleniu.practice;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class program13 {
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/HP/OneDrive/Documents/learningHTML1.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(/html/body/input)[1]")).sendKeys("Yash123");
		driver.findElement(By.xpath("(/html/body/input)[2]")).sendKeys("Yash123");
		driver.findElement(By.xpath("(/html/body/input)[3]")).sendKeys("Yash123");
		driver.findElement(By.tagName("a")).click();


	}

}
