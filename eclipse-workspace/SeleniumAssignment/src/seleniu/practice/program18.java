package seleniu.practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class program18 {
	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement DropDown = driver.findElement(By.id("searchDropdownBox"));
		Select s1 = new Select(DropDown);
		s1.selectByValue("search-alias=stripbooks");
		Thread.sleep(5000);
        s1.selectByValue("search-alias=mi");
        Thread.sleep(5000);
        s1.selectByValue("search-alias=apparel");
        Thread.sleep(5000);
        s1.selectByValue("search-alias=instant-video");
        Thread.sleep(5000);
	}

}
