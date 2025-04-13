package Spicejet_TestCase;

import org.testng.annotations.Test;

import Spicejet_Source.Home_Page;
import Spicejet_Source.Logout_Page;

public class TestCase12 extends Launch_and_Quit {
	
	@Test
	public void login_search_logout() throws InterruptedException
	{
		Home_Page h1=new Home_Page(driver);
		h1.login();
		h1.mobile_no();
		h1.password();
		Thread.sleep(2000);
		h1.login_button();
		
		Thread.sleep(3000);
		h1.source_city();
		h1.source_name();
		h1.destination_city();
		h1.destination_name();
		h1.date_forward_button();
		h1.date_select();
		h1.flight_search_button();
		Thread.sleep(5000);
		
		Logout_Page l1= new Logout_Page(driver);
		l1.logout_click();
		l1.logout_button();
	}

}
