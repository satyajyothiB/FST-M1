package SeleniumActivities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver =new FirefoxDriver();
driver.get("https://www.training-support.net/selenium/javascript-alerts");
System.out.println(driver.getTitle());
driver.findElement(By.cssSelector("button#simple")).click();
Alert simpleAlert=driver.switchTo().alert();
System.out.println("Simple Alert text is "+simpleAlert.getText());
simpleAlert.accept();
driver.close();

	}

}
