package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4a {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new FirefoxDriver();	
		driver.get("https://training-support.net/selenium/simple-form");
		String pageTitle =driver.getTitle();
		System.out.println(pageTitle);
		WebElement firstName =driver.findElement(By.xpath("//input[@id='firstName']"));
		WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement contact = driver.findElement(By.xpath("//input[@id='number']"));
		WebElement formSubmit = driver.findElement(By.xpath("//input[@value='submit']"));
		
		//Sending values to webElement
		firstName.sendKeys("Sita");
		Thread.sleep(4000);
		lastName.sendKeys("K");
		Thread.sleep(4000);
		email.sendKeys("sitaK@gml.com");
		Thread.sleep(4000);
		contact.sendKeys("753547659");
		Thread.sleep(4000);
		formSubmit.submit();
		driver.close();
		

		
	}

}
