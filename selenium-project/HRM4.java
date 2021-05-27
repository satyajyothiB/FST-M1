package HRMProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HRM4 {

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
Driver.findElement(By.id("menu_pim_viewPimModule")).click();
Thread.sleep(2000);
Driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
Thread.sleep(2000);

WebElement FirstName = Driver.findElement(By.xpath("//input[@id='firstName']"));
WebElement LastName = Driver.findElement(By.xpath("//input[@id='lastName']"));
FirstName.sendKeys("Satya");
Thread.sleep(2000);
LastName.sendKeys("Jyothi");
Thread.sleep(2000);
Driver.findElement(By.xpath("//input[@id='btnSave']")).click();
Thread.sleep(2000);

Driver.findElement(By.id("menu_pim_viewPimModule")).click();
Thread.sleep(2000);

WebElement Search = Driver.findElement(By.id("empsearch_employee_name_empName"));
Search.sendKeys("Satya Jyothi");

Driver.findElement(By.id("searchBtn")).click();
Thread.sleep(2000);

String VerifyName = Driver.findElement(By.xpath("//a[text()='Satya']")).getText();
Assert.assertEquals(VerifyName, "Satya");

Driver.close();
	}
}
