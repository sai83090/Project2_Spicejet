package TestNg_Class;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependonmethod {
	
	@Test
	public void login() {
		System.out.println("login");
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods="login")
	public void logout() {
		System.out.println("logout");
	}

}
