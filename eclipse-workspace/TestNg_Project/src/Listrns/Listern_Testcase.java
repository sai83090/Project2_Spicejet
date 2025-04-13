package Listrns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listerners.class)
public class Listern_Testcase {
	@Test
	public void sbi()
	{
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
    Assert.assertTrue(false);
	}
}
