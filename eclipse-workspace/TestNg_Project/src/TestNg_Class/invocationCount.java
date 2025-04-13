package TestNg_Class;

import org.testng.annotations.Test;

public class invocationCount {
	
	@Test(invocationCount=10)
	public void abc()
	{
		System.out.println("2");
	}

}
