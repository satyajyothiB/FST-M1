package cucumberExamples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Alerts {
	WebDriver driver ;
	WebDriverWait wait;
	Alert alerts;

	@Given("^User is on the page$")
	public void alertsPage() {
		 driver = new FirefoxDriver();
	      wait = new WebDriverWait(driver, 10);
	       
	     //open and navigate to alerts screen
	      driver.get("https://www.training-support.net/selenium/javascript-alerts");
	      
	}
	
	@When("^User clicks the Simple Alert button$")
	public void simpleAlert() {
		driver.findElement(By.id("simple")).click();
	}
	
	@When("^User clicks the Confirm Alert button$")
		public void confirmAlert() {
		
		driver.findElement(By.id("confirm")).click();
		}
	
	@When("^User clicks the Prompt Alert button")
	public void promtAler() {
		driver.findElement(By.id("prompt")).click();
	}
	
	@Then("^Alert opens$")
	public void alertscreen() {
		 alerts= driver.switchTo().alert() ;
	}
	
	@And("^Read the text from it and print it$")
	public void getInfo() {
		
		String alertMsg= alerts.getText();
		System.out.println(alertMsg);
	}
	
    @And("^Write a custom message in it$")
    
    public void customMsg() {
    	alerts.sendKeys("This is custom message");
    }
	@And("^Close the alert$")
	public void closeAlert() {
		alerts.accept();
	}
	
	@And("^Close the alert with Cancel$")
	
	public void closeAlertCancel() {
		alerts.dismiss();
	}
	
	@And("^Read the result text$")
	
	public void resultText() {
		
		String resultText =driver.findElement(By.id("result")).getText();
		System.out.println(resultText);
	}
	 @And("^Close Browser$")
	   public void closeBrowser() {
	        //Close browser
	        driver.close();
	    }
	
}
