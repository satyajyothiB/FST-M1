package testNGTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity3 {
	WebDriver driver;
	@BeforeClass
	  public void beforeC() {
		driver =new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/login-form");
	  }
  @Test
  public void testcase1() {
	  driver.findElement(By.id("username")).sendKeys("admin");
	  driver.findElement(By.id("password")).sendKeys("password");
	  driver.findElement(By.xpath("//button[text()='Log in']")).click();
	  String confirmText =driver.findElement(By.id("action-confirmation")).getText();
	  Assert.assertEquals(confirmText, "Welcome Back, admin","Text not matching");
  }
  
  @AfterClass
  public void afterC() {
  	driver.quit();
  	
  }
}
