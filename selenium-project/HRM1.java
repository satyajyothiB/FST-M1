package HRMProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HRM1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver Driver = new ChromeDriver();
Driver.navigate().to("http://alchemy.hguy.co/orangehrm");
Thread.sleep(2000);

String Title = Driver.getTitle();
System.out.println(Title);

Assert.assertEquals(Title,"OrangeHRM");
Driver.close();
	}

}
