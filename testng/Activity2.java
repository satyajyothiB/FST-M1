package testNGTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity2 {
	WebDriver driver;
  @BeforeMethod
  public void beforeM() {
	  driver= new FirefoxDriver();
	  driver.get("https://www.training-support.net/selenium/target-practice");
	    }
  @Test(priority=0)
  public void one() {
	String title= driver.getTitle();
	Assert.assertEquals(title,"Target Practice");
	  }
  @Test(priority=1)
  public void two() {
	  WebElement buttonBlack= driver.findElement(By.xpath("//button[contains(@class,'black')]"));
	  Assert.assertEquals(buttonBlack.getText(), "Green");
  }
  
  @Test(priority=2, enabled=false)
  public void three() {
	System.out.println("Skipped test");
  }
  @Test(priority=3)
  public void forth() {
	  throw new SkipException("Skipping Testcase");
      }
  @AfterMethod
  public void afterM() {
	  driver.close();
  }
}
