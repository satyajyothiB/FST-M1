package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Activity10a {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver= new FirefoxDriver();
		 Actions actions =new Actions(driver);
		 String pressedKeyText;
		 driver.get("https://www.training-support.net/selenium/input-events");
		 System.out.println(driver.getTitle());
		 Action sequence= actions.sendKeys("S").build();
		 sequence.perform();
		 WebElement pressedKey = driver.findElement(By.id("keyPressed"));
		 pressedKeyText= pressedKey.getText();
		 System.out.println("Pressed key is "+pressedKeyText);
		 
		 Action actionSequence2 = actions
	                .keyDown(Keys.CONTROL)
	                .sendKeys("a")
	                .sendKeys("c")
	                .keyUp(Keys.CONTROL)
	                .build();
	        actionSequence2.perform();
	        Thread.sleep(1000);
	        pressedKeyText = pressedKey.getText();
	        System.out.println("Pressed key is: " + pressedKeyText);
	        WebElement cubeVal = driver.findElement(By.className("active"));
		     System.out.println("cube value is  " + cubeVal.getText());
	     driver.close();
		 
	}

}
