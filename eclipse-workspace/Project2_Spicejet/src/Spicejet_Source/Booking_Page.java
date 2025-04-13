package Spicejet_Source;

import java.util.Arrays;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Booking_Page {
	
	@FindBy(xpath="(//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-poiln3 r-ubezar r-j2kj52'])[1]")
	WebElement Title_Selection_dd;
	@FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj r-poiln3 r-ubezar'])[1]")
	WebElement Title_Selection;
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[1]")
	WebElement First_Name;
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[2]")
	WebElement Last_Name;
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-1yadl64 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[1]")
	WebElement Mobile_No;
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[3]")
	WebElement Email_Add;
	@FindBy(xpath="(//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-poiln3 r-ubezar'])[2]")
	WebElement County_Selection;
	@FindBy(xpath="(//div[@class='css-1dbjc4n'])[13]")
	WebElement County_Selection_dd;
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[4]")
	WebElement Town_Name;
	@FindBy(xpath="(//*[name()='rect'])[4]")
	WebElement Passenger_info_checkbox;
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-6ity3w r-d9fdf6 r-9qu9m4 r-ah5dr5 r-1otgn73']")
	WebElement Coutinue_button_booking_page;
	/*@FindBy(xpath="//div[@data-testid='bookingFlow-meals-add-cta']//div[@class='css-76zvg2 r-jwli3a r-poiln3 r-ubezar r-1kfrs79 r-1d4mawv'][normalize-space()='Add']")
	WebElement SpiceCafe_Add_Button;
	@FindBy(xpath="(//div[@class='css-76zvg2 r-jwli3a r-poiln3 r-1enofrn r-1wyvozj r-u8s1d r-1v2oles r-1i38069 r-184en5c'])[1]")
	WebElement Seat_Selection;
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73'])[1]")
	WebElement Meal_Selection_Option;*/
	@FindBy(xpath="(//div[.='Continue'])[6]")
	WebElement Continue_Button;
	@FindBy(xpath="(//*[name()='img'])[35]")
	WebElement Close_PopUp;
	
	public void title_selection_dd()
	{
		Title_Selection_dd.click();
	}
	public void title_selection()
	{
		Title_Selection.click();
	}
	public void FIRST_NAME()
	{
		First_Name.sendKeys("Yashwanth");
		First_Name.sendKeys(Keys.TAB);
		
	}
	public void LAST_NAME()
	{
		Last_Name.sendKeys("Yashwanth");
	}
	public void Email()
	{
		Email_Add.sendKeys("namburi.yashwanth@gmail.com");
		Email_Add.sendKeys(Keys.TAB);
		
	}
	public void county_selection()
	{
		County_Selection.click();
		
	}
	public void county_selection_dd(WebDriver driver)
	{
		Select s1=new Select(County_Selection_dd);
		s1.selectByVisibleText("India");
	}
	public void town_name()
	{
		Town_Name.sendKeys("Bangalore");
	}
	public void Mobile_No()
	{
		Mobile_No.sendKeys("9930034615");
	}
	public void passenger_info_checkbox()
	{
		Passenger_info_checkbox.click();
	}
	public void payment_page_continue_button()
	{
		Coutinue_button_booking_page.click();
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches",
		Arrays.asList("disable-popup-blocking"));
	}
	/*public void SpiceCafe_selection()
	{
		SpiceCafe_Add_Button.click();
	}
	public void first_add_button()
	{
		Seat_Selection.click();
	}
	public void select_meals_option()
	{
		Meal_Selection_Option.click();
	}*/
	public void pop_up_close()
	{
		Close_PopUp.click();
	}
	public void continue_button()
	{
		Continue_Button.click();
	}
	
	
	public Booking_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


}
