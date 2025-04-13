package Spicejet_TestCase;

import org.testng.annotations.Test;

import Spicejet_Source.Home_Page;

public class TestCase3 extends Launch_and_Quit {
	
	@Test
	public void Login() throws InterruptedException
	{
		Home_Page h1=new Home_Page(driver);
		h1.login();
		h1.mobile_no();
		h1.invalid_password();
		Thread.sleep(2000);
		h1.login_button();
	}


}
