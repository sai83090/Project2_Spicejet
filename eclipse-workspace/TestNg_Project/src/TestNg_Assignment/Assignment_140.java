package TestNg_Assignment;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment_140 {
	
	@BeforeMethod()
	public void Bs()
	{
		System.out.println("Before Method");
	}
	
	@Test()
	public void Test1()
	{
		System.out.println("Test Cases 1");
	}
	@Test()
	public void Test2()
	{
		System.out.println("Test Cases 2");
	}
	@Test()
	public void Test3()
	{
		System.out.println("Test Cases 3");
	}

}
