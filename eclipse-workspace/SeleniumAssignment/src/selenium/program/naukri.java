package selenium.program;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class naukri {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531");
		driver.manage().window().maximize();
		WebElement google = driver.findElement(By.xpath("//span[.='Google']"));
		google.click();
		String parentclass = driver.getWindowHandle();
		Set<String> parentandChildclass = driver.getWindowHandles();
		System.out.println(parentclass);
		System.out.println(parentandChildclass);
		Thread.sleep(2000);
		Iterator<String> pcid = parentandChildclass.iterator();
        String parentId = pcid.next();
		String childId = pcid.next();   
		System.out.println(parentId);
		System.out.println(childId);
		driver.switchTo().window(childId);
		Thread.sleep(2000);
		driver.close();
	}

}
