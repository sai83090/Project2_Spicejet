package TestNg_Class;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders_1 {
	
	@Test(dataProvider="data1")
	public void method_for_addition(int number)
	{
		System.out.println(number+100);
	}
	
	@DataProvider(name="data1")
	public Object[][] method1() 
	{
		return new Object[][] {{100},{200},{300},{400},{500}};
	}

	@Test(dataProvider="data2")
	public void method_for_addition(String emailid)
	{
		System.out.println(emailid.concat("is a emailid"));
	}
		
	@DataProvider(name="data2")
	public Object[][] method2() 
	{
		return new Object[][] {{"Diya@email"},{"Chandrakala@gmail.com"},{"Keerthana@gmail.com"},{"paruu@gmail.com"},{"abhitha@gmail.com"}};
	}
}