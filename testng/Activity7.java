package testNGTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Activity7 {
	WebDriver driver;
	@BeforeClass
	public void beforeC() {
		driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/login-form");
	}
	@DataProvider(name="Authentication")
	public Object[][] credentials(){
		return new Object[][] { { "admin", "password" }, { "admin", "password" }};
	}
	
	@AfterClass
	public void afterC() {
		driver.close();
	}
  @Test(dataProvider="Authentication")
  public void login_dataProvider(String usr,String pwd) {
	  
	  driver.findElement(By.id("username")).sendKeys(usr);
	  driver.findElement(By.id("password")).sendKeys(pwd);
	  driver.findElement(By.xpath("//button[text()='Log in']")).click();
  }
}
