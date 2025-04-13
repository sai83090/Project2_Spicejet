package selenium.program;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinks  {
	public static void main(String args[]) throws IOException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		List <WebElement> e1=driver.findElements(By.tagName("a"));
		int count = e1.size();
		System.out.println(count);
		for(int i=0;i<=e1.size()-1;i++)
		{
		WebElement a = 	e1.get(i);
		String s1 = a.getAttribute("href");
		System.out.println(s1);
		linkvalidation(s1);
		}
	}
		static void linkvalidation(String url) throws IOException
		{
			try
			{
			URL u1 = new URL(url);
			HttpsURLConnection u2= (HttpsURLConnection) u1.openConnection();
			if(u2.getResponseCode()==200)
			{
				System.out.println("LInk is valid "+ u2.getResponseMessage()+ " " + url);
		    }
			else
			{
				System.out.println("Link is Invalid "+ url);
			}
		}
		catch(Exception ex) 
		{
			System.out.println("Exception is not handled");
			
		}
		}
}


