package TestNg_Assignment;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment_139 {
	
	@BeforeMethod()
	public void Bs()
	{
		System.out.println("Before MEthod");
	}
	@Test()
	public void abc()
	{
		System.out.println("Test Cases 1");
	}
	@Test()
	public void xyz()
	{
		System.out.println("Test Cases 2");
	}
	@AfterMethod()
	public void Am()
	{
		System.out.println("After Method");
	}


}
