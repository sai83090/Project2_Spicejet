package seleniu.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program25 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
        driver.findElement(By.xpath("(//a[.='CONTINUE TO LOGIN'])[1]")).click();
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("Yashwant");
        WebElement password = driver.findElement(By.id("label2"));
        password.sendKeys("Yashwant");
        WebElement captcher = driver.findElement(By.id("loginCaptchaValue"));
        captcher.sendKeys("hpdne");
        driver.findElement(By.id("Button2")).click();
        
        
	}

}
