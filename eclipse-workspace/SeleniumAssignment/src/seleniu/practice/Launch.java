package seleniu.practice;
import org.openqa.selenium.chrome.ChromeDriver;
public class Launch {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver c1 = new ChromeDriver();
		c1.get("https://www.google.com");
		Thread.sleep(5000);
//		c1.quit();
//		c1.close();
	}

}
