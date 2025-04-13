package Spicejet_TestCase;

import org.testng.annotations.Test;

import Spicejet_Source.Booking_Page;
import Spicejet_Source.Home_Page;
import Spicejet_Source.Search_Page;

public class TestCase8 extends Launch_and_Quit {
	
	@Test
	public void additional_Details() throws InterruptedException
	{
		Home_Page h1=new Home_Page(driver);
		h1.source_city();
		h1.source_name();
		h1.destination_city();
		h1.destination_name();
		h1.date_forward_button();
		h1.date_select();
		h1.flight_search_button();
		
		Search_Page s1=new Search_Page(driver);
		s1.search_continue_button();
		
		Booking_Page b1=new Booking_Page(driver);
		b1.title_selection_dd();
		b1.title_selection();
		b1.FIRST_NAME();
		b1.LAST_NAME();
		b1.Mobile_No();
		b1.Email();
	
		b1.town_name();
		Thread.sleep(2000);
		b1.passenger_info_checkbox();
		b1.payment_page_continue_button();
		
		b1.continue_button();
		
	}

}
