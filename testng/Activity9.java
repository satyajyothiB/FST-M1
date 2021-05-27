package testNGTests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity9 {
	WebDriver driver;
	
	@BeforeTest
	public void beforeT() {
		driver = new FirefoxDriver();
		Reporter.log("Starting of test case");
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		Reporter.log("Browser opened success fully");
	}
	
	@AfterTest
	public void afterT() {
		driver.close();
		Reporter.log("The End");
	}
	@BeforeMethod
	public void beforeM() {
			
		driver.switchTo().defaultContent();
		Reporter.log("Switched to main page");
	}
	
  @Test
  public void simpleAlertTestCase() {
	  driver.findElement(By.id("simple")).click();
	  Reporter.log("Simple Alert button is clicked");
	  Alert simpleAlert= driver.switchTo().alert() ;
	  Reporter.log("Switched to Simple Alert ");
	 
	  //Get text in the alert box and print it
      String alertText = simpleAlert.getText();
      Reporter.log("Alert text is: " + alertText + " |");
      
      //Assertion
      Assert.assertEquals("This is a JavaScript Alert!", alertText);

      simpleAlert.accept();
      Reporter.log("Alert closed");

      Reporter.log("Simple Alert Test case ended |");
	  
  }
  
  @Test
  public void confirmAlertTestCase() {
	   driver.findElement(By.id("confirm")).click();
	   Reporter.log("Confirm Alert button is clicked");
	  Alert cnfmAlert= driver.switchTo().alert() ;
	  Reporter.log("Switched to Confirm Alert ");
	  
	  String alertText = cnfmAlert.getText();
	  Reporter.log("Alert text is: " + alertText + " |");
	  Assert.assertEquals(alertText, "This is a JavaScript Confirmation!");
	
	  cnfmAlert.dismiss();
	  Reporter.log("Confirm Alert test case is completed");
  }
  
  @Test
  public void promptAlertTestCase() {
	  
	  driver.findElement(By.id("prompt")).click();
	  Reporter.log("Prompt Alert button is clicked");
	  Alert prmtAlert= driver.switchTo().alert() ;
	  Reporter.log("Wsitched to prompt Alert");
	  
	  String alertText =prmtAlert.getText();
	   Reporter.log("Alert text is: " + alertText + " |");
	   Assert.assertEquals(alertText, "This is a JavaScript Prompt!");
	   
	   prmtAlert.sendKeys("Sample text for prompt alerts");
	   Reporter.log("Messgae send to promt alerts");
	   
	   prmtAlert.accept();
	   Reporter.log("End of promt alert");
	       
  }
}
