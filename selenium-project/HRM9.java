package HRMProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRM9 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver Driver = new ChromeDriver();
		
		Driver.navigate().to("http://alchemy.hguy.co/orangehrm");
		
		WebElement UserName = Driver.findElement(By.xpath("//input[@id='txtUsername']"));
		WebElement Password = Driver.findElement(By.xpath("//input[@id='txtPassword']"));
		
		UserName.sendKeys("orange");
		Thread.sleep(4000);
		
		Password.sendKeys("orangepassword123");
		Thread.sleep(4000);
		
		Driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Thread.sleep(4000);
		
		Driver.findElement(By.id("menu_pim_viewMyDetails")).click();
		Thread.sleep(4000);
		
		Driver.findElement(By.xpath("//a[text()='Emergency Contacts']")).click();
		Thread.sleep(4000);
		
		String EmergencyContact1 = Driver.findElement(By.xpath("(//td[@class='emgContactName'])[1]")).getText();
		System.out.println("EmergencyContact1 is " + EmergencyContact1);
		String EmergencyContact1Rel = Driver.findElement(By.xpath("//td[text()='Brother']")).getText();
		System.out.println("Relationship of EmergencyContact1 is " + EmergencyContact1Rel);
		String EmergencyContact1Tel = Driver.findElement(By.xpath("//td[text()='9999997777']")).getText();
		System.out.println("Contact of EmergencyContact1 is " + EmergencyContact1Tel);
		Thread.sleep(4000);
		
		
		String EmergencyContact2 = Driver.findElement(By.xpath("(//td[@class='emgContactName'])[2]")).getText();
		System.out.println("EmergencyContact2 is " + EmergencyContact2);
		String EmergencyContact2Rel = Driver.findElement(By.xpath("//td[text()='Spouse']")).getText();
		System.out.println("Relationship of EmergencyContact2 is " + EmergencyContact2Rel);
		String EmergencyContact2Tel = Driver.findElement(By.xpath("//td[text()='1234567890']")).getText();
		System.out.println("Contact of EmergencyContact2 is " + EmergencyContact2Tel);
		Thread.sleep(4000);
		
		
		String EmergencyContact3 = Driver.findElement(By.xpath("(//td[@class='emgContactName'])[3]")).getText();
		System.out.println("EmergencyContact3 is " + EmergencyContact3);
		String EmergencyContact3Rel = Driver.findElement(By.xpath("//td[text()='brother']")).getText();
		System.out.println("Relationship of EmergencyContact3 is " + EmergencyContact3Rel);
		String EmergencyContact3Tel = Driver.findElement(By.xpath("//td[text()='0123456789']")).getText();
		System.out.println("Contact of EmergencyContact3 is " + EmergencyContact3Tel);
		Thread.sleep(4000);
		
		Driver.close();

	}

}
