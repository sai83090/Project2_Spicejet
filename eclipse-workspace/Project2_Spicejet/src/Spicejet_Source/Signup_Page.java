package Spicejet_Source;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Signup_Page {
	
	@FindBy(xpath="//select[@class='form-control form-select ']")
	WebElement Title_Dropdown;
	@FindBy(id="first_name")
	WebElement FirstName_TextField;
	@FindBy(id="last_name")
	WebElement LastName_TextField;
	@FindBy(xpath="//select[@class='form-control form-select']")
	WebElement Country_Dropdown;
	
	@FindBy(id="dobDate")
	WebElement Date_Button;
	@FindBy(className="react-datepicker__month-select")
	WebElement Month_DropDown;
	@FindBy(className="react-datepicker__year-select")
	WebElement Year_DropDown;
	@FindBy(xpath="//div[.='23']")
	WebElement Date_Selection;
	
	@FindBy(xpath="//input[@class=' form-control']")
	WebElement MobileNo_TextField;
	@FindBy(xpath="//input[@id='email_id']")
	WebElement Email_TextField;
	@FindBy(id="new-password")
	WebElement Password_TextField;
	@FindBy(id="c-password")
	WebElement C_Password_TextField;
	@FindBy(id="defaultCheck1")
	WebElement Check_Button;
	@FindBy(linkText="Submit")
	WebElement Submit_Button;
	
	
	
	public void title_dropdown(WebDriver driver)
	{
		Select s1=new Select(Title_Dropdown);
		s1.selectByVisibleText("Mr");	
	}
	public void FirstName_TextField()
	{
		FirstName_TextField.sendKeys("Yashwanth");
	}
	public void LastName_TextField()
	{
		LastName_TextField.sendKeys("Namburu");
	}
	public void country_dropdown(WebDriver driver)
	{
		Select s1=new Select(Country_Dropdown);
		s1.selectByVisibleText("Iceland ");	
	}
	public void Date_button()
	{
		Date_Button.click();
	}
	public void month_dropdown(WebDriver driver)
	{
		Select s1=new Select(Month_DropDown);
		s1.selectByVisibleText("December");	
	}
	public void year_dropdown(WebDriver driver)
	{
		Select s1=new Select(Year_DropDown);
		s1.selectByVisibleText("1986");	
	}
	@Test(dependsOnMethods="year_dropdown")
	public void date_selection()
	{
		Date_Selection.click();
	}
	public void mobile_no()
	{
		MobileNo_TextField.sendKeys("8309046863");
	}
	@Test(dependsOnMethods = "mobile_no")
    public void email(WebDriver driver) {
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("email_id")));
		Email_TextField.sendKeys("namburi.yashwanth@gmail.com");
	}
	public void password()
	{
		Email_TextField.sendKeys("Automation@123");
	}
	public void con_password()
	{
		Email_TextField.sendKeys("Automation@123");
	}
	public void checkbox()
	{
		Check_Button.click();
	}
	public void submit()
	{
		Submit_Button.click();
	}
	
	public Signup_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
