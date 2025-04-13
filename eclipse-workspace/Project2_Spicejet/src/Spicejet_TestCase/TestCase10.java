package Spicejet_TestCase;

import org.testng.annotations.Test;

import Spicejet_Source.Home_Page;

public class TestCase10 extends Launch_and_Quit {

	
	@Test
	public void Flight_Details()
	{
		Home_Page h1=new Home_Page(driver);
		h1.source_city();
		h1.source_name();
		h1.destination_city();
		h1.destination_name();
		h1.date_forward_button();
		h1.date_select();
		h1.flight_search_button();
		h1.flight_details_dropdown();
		//h1.flight_info();
		
		
	}
}
