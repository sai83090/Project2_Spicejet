package Spicejet_Source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddOn_Page {

	@FindBy(xpath="(//div[.='Continue'])[6]")
	WebElement Continue_Button;
	@FindBy(id="destination_publishing_iframe_spicejet_0")
	WebElement iFrame1;
	//@FindBy(id="selectfrompopup")
	@FindBy(id="at_addon_close_icon")
	WebElement Pop_up1;
	
	public void continue_button()
	{
		Continue_Button.click();	
	}
	public void iframe1(WebDriver driver)
	{
		driver.switchTo().frame(iFrame1);
	}
	public void pop_up1()
	{
		Pop_up1.click();
	}
	
	public AddOn_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
