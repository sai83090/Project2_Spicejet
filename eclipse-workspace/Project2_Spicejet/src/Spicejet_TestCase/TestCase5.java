package Spicejet_TestCase;

import org.testng.annotations.Test;

import Spicejet_Source.Home_Page;

public class TestCase5 {
	
	
	@Test
	public void Round_Trip()
	{
		Home_Page h1=new Home_Page(null);
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
