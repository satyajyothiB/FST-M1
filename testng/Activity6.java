package testNGTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Activity6 {
	WebDriver driver;
	
@BeforeClass
public void beforeC() {
	driver = new FirefoxDriver();
	driver.get("https://www.training-support.net/selenium/login-form");
}

@AfterClass
public void afterC() {
	driver.close();
}
  @Test()
  @Parameters({"username","password"})
  public void login(String usr, String pwd) {
	  driver.findElement(By.id("username")).sendKeys(usr);
	  driver.findElement(By.id("password")).sendKeys(pwd);
	  driver.findElement(By.xpath("//button[text()='Log in']")).click();
  }
}
