package IRetry_Con;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class TestCase_1 {
	
	@Test(retryAnalyzer=IRetry_Con.IRetry.class)
	
	public void login_Amazon() throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("Shoe");
		driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
		driver.findElement(By.xpath("(//div[@class=\"a-section aok-relative s-image-tall-aspect\"])[30]")).click();
		Set<String> s11 = driver.getWindowHandles();
		System.out.println(s11);
		Iterator<String> pid = s11.iterator();
		String pid1 = pid.next();
		String cid = pid.next();
		System.out.println(pid1);
		System.out.println(cid);
		driver.switchTo().window(cid);
	    driver.findElement(By.xpath("//input[@id=\"add-to-cart-button\"]")).click();
	    Thread.sleep(2000);
	}
}
