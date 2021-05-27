package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity12a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/nested-iframes");
		System.out.println(driver.getTitle());
		driver.switchTo().frame(0);
		
		driver.switchTo().frame(0);
		String fifheading= driver.findElement(By.xpath("//div[@class='content']")).getText();
		 System.out.println(fifheading);
		 driver.switchTo().parentFrame();
		 driver.switchTo().frame(1);
		 String sifheading= driver.findElement(By.xpath("//div[@class='content']")).getText();
		 System.out.println(sifheading);
		
		 driver.switchTo().defaultContent();
		 driver.close();
		

	}

}
