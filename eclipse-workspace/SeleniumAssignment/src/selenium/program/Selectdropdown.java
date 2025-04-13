package selenium.program;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Selectdropdown {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
        WebElement Skills = driver.findElement(By.id("Skills"));
        Select s1 = new Select(Skills);
        s1.selectByValue("select1");
        WebElement technicalSkills = driver.findElement(By.id("technicalskills"));
        Select s2 = new Select(technicalSkills);
        s2.selectByValue("Core Java");
        WebElement Country = driver.findElement(By.id("Country"));
        Select s3 = new Select(Country);
        s3.selectByValue("India");
        WebElement Relegion = driver.findElement(By.id("Relegion"));
        Select s4 = new Select(Relegion);
        s4.selectByValue("Hindu");
        
	}

}
