package seleniu.practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class program16 {
	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://grotechminds.com/registration/");
	driver.manage().window().maximize();
	WebElement Fields = driver.findElement(By.id("fname"));
	Fields.sendKeys("yashwanth");
	WebElement Fields_1 = driver.findElement(By.id("lname"));
	Fields_1.sendKeys("Namburu");
	WebElement Fields_2 = driver.findElement(By.id("email"));
	Fields_2.sendKeys("Namburu@123");
	WebElement Fields_3 = driver.findElement(By.id("password"));
	Fields_3.sendKeys("ya@8787");
	WebElement Fields_4 = driver.findElement(By.id("Pincode"));
	Fields_4.sendKeys("524003");
	
	}

}
