package testNGTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity5 {
	WebDriver driver;
	@BeforeClass(alwaysRun = true)
	  public void beforeC() {
		//WebDriver driver;
		driver =new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/target-practice");
	  }
  
@Test (groups = {"HeaderTests", "ButtonTests"})
  public void testcase1() {
	 String title= driver.getTitle();
	 Assert.assertEquals(title, "Target Practice");
  }
  
  @Test(dependsOnMethods= {"testcase1"},groups= {"HeaderTests"})
  public void testcase2() {
	  WebElement h3 = driver.findElement(By.xpath("//h3"));
	  Assert.assertEquals(h3.getText(), "Third header");
	
  }
  
  @Test(dependsOnMethods= {"testcase1"},groups= {"HeaderTests"})
  public void testcase3() {
	  WebElement h5 = driver.findElement(By.xpath("//h5"));
	  Assert.assertEquals(h5.getText(), "Fifth header");
  }
  
  @Test(dependsOnMethods= {"testcase1"},groups= {"ButtonTests"})
  public void testcase4() {
	  WebElement Olive =driver.findElement(By.xpath("//button[contains(@class,'olive')]"));
	  Assert.assertEquals(Olive.getText(), "Olive");
	   }
  
  @Test(dependsOnMethods= {"testcase1"},groups= {"ButtonTests"})
  public void testcase5() {
	  WebElement button =driver.findElement(By.xpath("//div[@class='column']/div[3]/button[1]"));
	  Assert.assertEquals(button.getText(), "Brown");
  }
  @AfterClass
  public void afterC() {
  	driver.quit();
  	
  }
}
