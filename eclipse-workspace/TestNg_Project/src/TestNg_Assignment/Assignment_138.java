package TestNg_Assignment;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Assignment_138 {
	@BeforeSuite()
	public void Bs()
	{
		System.out.println("Before Suite");
	}
	@AfterSuite()
	public void As()
	{
		System.out.println("AfterSuite");
	}
	@BeforeMethod()
	public void Bm()
	{
		System.out.println("Before Method");
	}
	@BeforeClass()
	public void Bc()
	{
		System.out.println("Before Class");
	}
	@AfterClass()
	public void Ac()
	{
		System.out.println("After Class");
	}
	@Test()
	public void Test()
	{
		System.out.println("Test");
	}

}
