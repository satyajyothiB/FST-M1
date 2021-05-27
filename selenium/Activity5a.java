package SeleniumActivities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5a {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
        System.out.println(driver.getTitle());
        WebElement cbox =driver.findElement(By.xpath("//input[@type='checkbox']"));
        System.out.println(cbox.isSelected());
        cbox.click();
        Thread.sleep(1000);
        System.out.println(cbox.isSelected());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.close();
	}

}
