package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new FirefoxDriver();	
		driver.get("https://www.training-support.net");
		// Using locator id
		WebElement aboutUs1= driver.findElement(By.id("about-link"));
		
		// Using linkText
		WebElement aboutUs2= driver.findElement(By.linkText("About Us"));
		
		// Using cssSelector
		WebElement aboutUs3= driver.findElement(By.cssSelector("#about-link"));
		
		// using className
		WebElement aboutUs4= driver.findElement(By.className("green"));		
		
		System.out.println(aboutUs1.getText());
		System.out.println(aboutUs2.getText());
		System.out.println(aboutUs3.getText());
		System.out.println(aboutUs4.getText());
		driver.close();
	}

}
