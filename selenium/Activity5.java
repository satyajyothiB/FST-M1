package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
        System.out.println(driver.getTitle());
        WebElement cbox =driver.findElement(By.xpath("//input[@type='checkbox']"));
        System.out.println(cbox.isDisplayed());
        driver.findElement(By.id("toggleCheckbox")).click();
        System.out.println(cbox.isDisplayed());
        
        driver.close();
	}

}
