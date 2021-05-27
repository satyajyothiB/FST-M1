package HRMProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HRM6 {

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
		
		Boolean DirectoryPresent = Driver.findElement(By.id("menu_directory_viewDirectory")).isDisplayed();
		Assert.assertTrue(DirectoryPresent);
		Thread.sleep(2000);
		
		Boolean DirectoryEnabled = Driver.findElement(By.id("menu_directory_viewDirectory")).isEnabled();
		Assert.assertTrue(DirectoryEnabled);
		Thread.sleep(2000);

		Driver.findElement(By.id("menu_directory_viewDirectory")).click();
		Thread.sleep(2000);
		
		String Header = Driver.findElement(By.xpath("//h1[text()='Search Directory']")).getText();
		Assert.assertEquals(Header, "Search Directory");
		Thread.sleep(2000);
		System.out.println(Header);
		Driver.close();		
	}

}
