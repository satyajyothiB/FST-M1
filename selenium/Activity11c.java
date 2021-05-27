package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11c {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
				WebDriver driver =new FirefoxDriver();
				driver.get("https://www.training-support.net/selenium/tab-opener");
				System.out.println(driver.getTitle());
				String mainTabHandle= driver.getWindowHandle();
				System.out.println(mainTabHandle);
				driver.findElement(By.id("launcher")).click();
				System.out.println("After first click "+driver.getWindowHandles());
				driver.switchTo().activeElement();
				System.out.println("Title in the first new tab " +driver.getTitle());
				driver.switchTo().window(mainTabHandle);
				driver.findElement(By.id("launcher")).click();
				System.out.println("After 2nd click "+driver.getWindowHandles());
				driver.switchTo().activeElement();
				System.out.println("Title in the 2nd new tab " +driver.getTitle());
				driver.switchTo().window(mainTabHandle);
				Thread.sleep(1000);
				driver.close();
	}

}
