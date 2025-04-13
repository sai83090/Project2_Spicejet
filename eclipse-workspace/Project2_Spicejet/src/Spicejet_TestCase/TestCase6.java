package Spicejet_TestCase;

import org.testng.annotations.Test;

import Spicejet_Source.Home_Page;

public class TestCase6 extends Launch_and_Quit{
	
	//validate search results for different classes( Economy, business,first class)
		@Test
		public void senior_citizen()
		{
			Home_Page h1=new Home_Page(driver);
			h1.source_city();
			h1.source_name();
			h1.destination_city();
			h1.destination_name();
			h1.date_select();
			h1.senior_citizen_radio_button();
			h1.flight_search_button();
			h1.senior_discount_popup();
			h1.continue_button();
		}

}
