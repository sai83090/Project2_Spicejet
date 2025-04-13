package selenium.program;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().back();
	}
}
