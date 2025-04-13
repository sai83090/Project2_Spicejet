package TestNg_Assignment;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment_137 {
	
	@BeforeSuite()
	public void BS()
	{
		System.out.println("Before Method");
	}
	@BeforeTest()
	public void Bt()
	{
		System.out.println("Before test");
	}
	@BeforeClass()
	public void Bc()
	{
		System.out.println("Before Class");
	}
	@BeforeMethod()
	public void Bm()
	{
		System.out.println("Before Method");
	}
	@Test()
	public void Test()
	{
		System.out.println("Test");
	}
}
