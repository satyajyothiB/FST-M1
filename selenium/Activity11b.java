package SeleniumActivities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector("button#prompt")).click();
		Alert promptAlert=driver.switchTo().alert();
		System.out.println("Prompt Alert text is "+promptAlert.getText());
		promptAlert.sendKeys("Yes, you are!");
		promptAlert.accept();
		driver.close();
	}

}
