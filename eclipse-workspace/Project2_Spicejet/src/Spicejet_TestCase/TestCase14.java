package Spicejet_TestCase;

import org.testng.annotations.Test;

import Spicejet_Source.Home_Page;

public class TestCase14 extends Launch_and_Quit {
	
	@Test
	public void Domestic_RoundTrip()
	{
		Home_Page h1=new Home_Page(driver);
		h1.round_trip_radio_button();
		h1.source_city();
		h1.source_name();
		h1.destination_city();
		h1.destination_name();
		//h1.date_dropdown();
		h1.date_select();
		h1.date_forward_button();
		h1.return_date();
		h1.flight_search_button();
	}

}
