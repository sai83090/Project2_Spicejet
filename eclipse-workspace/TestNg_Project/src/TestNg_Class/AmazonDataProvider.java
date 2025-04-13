package TestNg_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class AmazonDataProvider {

	@Test(dataProvider = "testdata")
	public void Login_amazon(String username, String password)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_ya_signin%26adgrpid%3D155259815513%26hvpone%3D%26hvptwo%3D%26hvadid%3D674842289437%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D7412669299860088395%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9185320%26hvtargid%3Dkwd-10573980%26hydadcr%3D14453_2316415%26gad_source%3D1&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.findElement(By.name("email")).sendKeys("username");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.name("password")).sendKeys("password");
		driver.findElement(By.id("signInSubmit")).click();
		driver.quit();
	}

	@DataProvider(name="testdata")
	public Object[][] data_for_amazonlogin()
	{
		Object  d1[][] = new Object[7][2];
		d1[0][0]="righusername";
		d1[0][1]="rightpassword";
		
		d1[1][0]= "right password";
		d1[1][1]= "wrong password";
		
		d1[2][0]= "wrong username";
		d1[2][1]= "right password";
		
		d1[3][0]= "wrong username";
		d1[3][1]= "wrong password";
				
		d1[4][0]= "Right username";
		d1[4][1]= "any password";
						
		d1[5][0]= "right username";
		d1[5][1]= "Blankpassword";
		
		d1[6][0]= "Blank Username";
		d1[6][1]= "right passsword";
	    
		return d1;
	}
}