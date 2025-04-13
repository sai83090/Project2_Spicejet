package TestNg_Class;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class8 {
	
	@BeforeMethod()
	public void pqr()
	{
		System.out.println("Before Method");
	}
	
	@Test()
	public void xyz()
	{
		System.out.println("Test1");
	}
	@Test()
	public void abc()
	{
		System.out.println("Test2");
	}
	@Test()
	public void uvw()
	{
		System.out.println("Test3");
	}
	
	@AfterMethod()
	public void pqr1()
	{
		System.out.println("After Method");
	}
	

}
