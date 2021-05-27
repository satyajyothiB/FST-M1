package HRMProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRM7 {

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
		Thread.sleep(4000);
		
		Driver.findElement(By.id("menu_pim_viewMyDetails")).click();
		Driver.findElement(By.xpath("(//a[text()='Qualifications'])[2]")).click();
		Driver.findElement(By.id("addWorkExperience")).click();
		
		WebElement Company = Driver.findElement(By.id("experience_employer"));
		Company.sendKeys("IBM");
		Thread.sleep(4000);
		
		WebElement JobTitle = Driver.findElement(By.id("experience_jobtitle"));
		JobTitle.sendKeys("Test Analyst");
		Thread.sleep(4000);
		
		Driver.findElement(By.id("btnWorkExpSave")).click();
		Thread.sleep(4000);
		
		Driver.close();
	}

}
;