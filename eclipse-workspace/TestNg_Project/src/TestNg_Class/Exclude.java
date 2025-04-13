package TestNg_Class;

import org.testng.annotations.Test;

public class Exclude {

	@Test(groups= {"smoke","system","reggression"})
	public void addition()
	{
		System.out.println("Addition");
	}
	@Test(groups = {"system"})
	public void subtraction()
	{
		System.out.println("subtraction");
	}
	@Test(groups= {"smoke","reggression"})
	public void multiple()
	{
		System.out.println("multiple");
	}
	@Test
	public void division()
	{
		System.out.println("divsion");
	}
	@Test(groups = {"system","reggression"})
	public void module()
	{
		System.out.println("module");
	}

}
