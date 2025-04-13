package selenium.program;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class EnabledorDisabled {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/HP/OneDrive/Documents/learningHTML1.html");
		driver.manage().window().maximize();
		WebElement l_name = driver.findElement(By.id("3"));
		boolean checkinglname = l_name.isEnabled();
		if(checkinglname==true && l_name.isDisplayed()==true)
		{
			l_name.sendKeys("123");
			Thread.sleep(1000);		
		}
		else
		{
			System.out.println("Do Nothing");
		}
	}
}
