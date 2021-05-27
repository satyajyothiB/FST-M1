package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver =new FirefoxDriver();	
		driver.get("https://www.training-support.net");
		 String title = driver.getTitle();
	        //Print the title of the page
	        System.out.println("Page title is: " + title);
		
		driver.findElement(By.xpath("//a[contains(text(),'About Us')]")).click();
		System.out.println("The tile of new page is "+driver.getTitle());
		driver.close();
		
		
		

	}

}
