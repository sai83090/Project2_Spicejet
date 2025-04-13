package seleniu.practice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class program14 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
    	driver.findElement(By.name("fname")).sendKeys("Sai Yashwanth");
    	driver.findElement(By.name("fname")).sendKeys(Keys.CONTROL+"a");
    	((WebElement) driver.findElements(By.name("fname"))).sendKeys(Keys.BACK_SPACE);
		
		

	}

}
