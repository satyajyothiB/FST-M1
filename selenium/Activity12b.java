package SeleniumActivities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity12b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		Actions actions =new Actions(driver);
		WebDriverWait wait =new WebDriverWait(driver,10);
		driver.get("https://www.training-support.net/selenium/popups");
		System.out.println(driver.getTitle());
		
		 //Find Sign in button
        WebElement button = driver.findElement(By.xpath("//button[contains(@class, 'orange')]"));
        actions.moveToElement(button).pause(Duration.ofSeconds(2)).build().perform();
        String tooltiptext =button.getAttribute("data-tooltip");
        System.out.println(tooltiptext);
        button.click();
        
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("signInModal"))));
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        
        System.out.println(driver.findElement(By.id("action-confirmation")).getText());
        
	}

}
