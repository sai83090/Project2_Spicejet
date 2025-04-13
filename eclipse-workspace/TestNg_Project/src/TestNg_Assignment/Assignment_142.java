package TestNg_Assignment;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment_142 {
	
	@Test
	public void Login()
	{
		System.out.println("Test cases 1");
	}
	
	@BeforeMethod
	public void xxx()
	{
		System.out.println("Before Method");
	}
	@Test(invocationCount=11)
	public void Logout()
	{
		System.out.println("Test cases 2");
	}
	@AfterMethod
	public void vvv()
	{
		System.out.println("After Method");
	}
	@Test
	public void Search()
	{
		System.out.println("Test Cases 3");
	}
	@Test
	public void Wishlist()
	{
		System.out.println("Test Cases 4");
	}

}
