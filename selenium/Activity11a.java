package SeleniumActivities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector("button#confirm")).click();
		Alert confirmAlert=driver.switchTo().alert();
		System.out.println("Confirm Alert text is "+confirmAlert.getText());
		confirmAlert.accept();
		driver.findElement(By.cssSelector("button#confirm")).click();
		confirmAlert.dismiss();
		driver.close();
	}

}
