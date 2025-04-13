package TestNg_Class;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders_2 {
	
	@Test(dataProvider="testdata")
	public void Login_in_amazon(String username, String Password)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(Password);
		driver.findElement(By.name("login")).click();
		System.out.println(username.concat("is a username and").concat(Password).concat("is a password"));
	}
	
	@DataProvider(name="testdata")
	public Object[][] dataforlogin()
	{
		 Object[][] d1 = new Object[2][2];
		 d1[0][0] = "yashwanth@gmail.com";
		 d1[0][1] = "Yash@9090";
		 d1[1][0] = "Diya@gmail.com";
		 d1[1][1] =  "Diya@7878";
		 return d1;
	}
}
