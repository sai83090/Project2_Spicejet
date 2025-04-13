package Amazonpractice;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Launch_Quit {
	private ChromeDriver driver;
	@BeforeMethod
	public void Launch()
	{
	    setDriver(new ChromeDriver());
		getDriver().get("https://www.amazon.in/");
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	@AfterMethod
	public void Quit()
	{
		getDriver().close();
	}
	public ChromeDriver getDriver() {
		return driver;
	}
	public void setDriver(ChromeDriver driver) {
		this.driver = driver;
	}

}
