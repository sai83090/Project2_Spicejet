package Spicejet_TestCase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(Listener.class)
public class Launch_and_Quit extends Listener
{
	WebDriver driver;
	@BeforeMethod
	public void Launch()
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));	
	}
	@AfterMethod
	public void Quit() throws InterruptedException
	{
		Thread.sleep(2000);
		//driver.quit();
	}

}