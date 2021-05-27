package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-attributes");
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//input[contains(@class,'-username')]")).sendKeys("Satya");
        driver.findElement(By.xpath("//input[contains(@class,'-password')]")).sendKeys("password");
        driver.findElement(By.xpath("//label[text()='Confirm Password']/following-sibling::input")).sendKeys("password");
        driver.findElement(By.xpath("//input[starts-with(@class,'email-')]")).sendKeys("a@test.com");
        driver.findElement(By.xpath("//button[@type='submit' and text()='Sign Up']")).click();
        System.out.println(driver.findElement(By.id("action-confirmation")).getText());
        driver.close();
	}

}
