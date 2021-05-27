package HRMProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HRMmm  5 {

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
        
		Driver.findElement(By.id("menu_pim_viewMyDetails")).click();
		Driver.findElement(By.id("btnSave")).click();
		
		WebElement FirstName = Driver.findElement(By.xpath("//input[@id='personal_txtEmpFirstName']"));
		FirstName.clear();
		
		WebElement LastName = Driver.findElement(By.xpath("//input[@id='personal_txtEmpLastName']"));
		LastName.clear();
		
		FirstName.sendKeys("Satya");
		Thread.sleep(2000);
		
		LastName.sendKeys("Jyothi");
		Thread.sleep(2000);
		
		Driver.findElement(By.id("personal_optGender_2")).click();
		Thread.sleep(2000);
		
		Select Nationality = new Select(Driver.findElement(By.id("personal_cmbNation")));
		Nationality.selectByVisibleText("British");
		Thread.sleep(2000);
		
		WebElement DOB = Driver.findElement(By.id("personal_DOB"));
		DOB.clear();
		DOB.sendKeys("1992-10-28");
		Thread.sleep(2000);
		
		Driver.findElement(By.id("btnSave")).click();
		Thread.sleep(2000);
		
		Driver.close();
	}

}
