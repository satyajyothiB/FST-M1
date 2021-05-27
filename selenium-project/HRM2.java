package HRMProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HRM2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver Driver = new ChromeDriver();
Driver.navigate().to("http://alchemy.hguy.co/orangehrm");
Thread.sleep(2000);

System.out.println(Driver.findElement(By.xpath("//div[@id='divLogo']/img")));
Driver.close();
	}

}
