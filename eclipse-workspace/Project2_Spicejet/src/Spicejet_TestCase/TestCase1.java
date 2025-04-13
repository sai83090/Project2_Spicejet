package Spicejet_TestCase;

import org.testng.annotations.Test;

import Spicejet_Source.Home_Page;
import Spicejet_Source.Signup_Page;

public class TestCase1 extends Launch_and_Quit
{
	@Test
	public void SingUp()
	{
		Home_Page h1= new Home_Page(driver);
		h1.signup(driver);
		
		Signup_Page s1=new Signup_Page(driver);
		s1.title_dropdown(driver);
		s1.FirstName_TextField();
		s1.LastName_TextField();
		s1.country_dropdown(driver);
		s1.Date_button();
		s1.month_dropdown(driver);
		s1.year_dropdown(driver);
		s1.date_selection();
		s1.mobile_no();
		s1.email(driver);
		s1.password();
		s1.con_password();
		s1.checkbox();
		s1.submit();	
	}
}
