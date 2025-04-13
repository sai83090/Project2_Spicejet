package TestNg_Class;

import org.testng.annotations.Test;

public class groups {
	
	
	@Test(groups= {"smoke","system"})
	public void addition()
	{
		System.out.println("Addition");
	}
	@Test(groups = {"system"})
	public void subtraction()
	{
		System.out.println("subtraction");
	}
	@Test(groups= {"smoke"})
	public void multiple()
	{
		System.out.println("multiple");
	}
	@Test
	public void division()
	{
		System.out.println("divsion");
	}
	@Test(groups = {"system"})
	public void module()
	{
		System.out.println("module");
	}
}
