package HRMProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HRM3 {

	public static void main(String[] args) throws InterruptedException {
WebDriver Driver = new ChromeDriver();
Driver.navigate().to("http://alchemy.hguy.co/orangehrm");
WebElement UserName = Driver.findElement(By.xpath("//input[@id='txtUsername']"));
WebElement Password = Driver.findElement(By.xpath("//input[@id='txtPassword']"));
UserName.sendKeys("orange");
Thread.sleep(2000);
Password.sendKeys("orangepassword123");
Thread.sleep(2000);
Driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
Thread.sleep(2000);
String HomePageTitle = Driver.getTitle();
Assert.assertEquals(HomePageTitle, "OrangeHRM");
Thread.sleep(2000);
Driver.close();
	}
}