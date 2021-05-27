package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
        System.out.println(driver.getTitle());
        WebElement inputbox =driver.findElement(By.id("input-text"));
        System.out.println(inputbox.isEnabled());
        driver.findElement(By.id("toggleInput")).click();
        System.out.println(inputbox.isEnabled());
        
        driver.close();
	}

}
