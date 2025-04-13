package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptpopmessage {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();
        WebElement login = driver.findElement(By.xpath("(//a[.='CONTINUE TO LOGIN'])[1]"));
        login.click();
        
	}

}
