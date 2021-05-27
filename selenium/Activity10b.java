package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity10b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		 Actions actions =new Actions(driver);
		 WebDriverWait wait= new WebDriverWait(driver,10);
		 
		 driver.get("https://training-support.net/selenium/drag-drop");
		 System.out.println(driver.getTitle());
		 WebElement ball =driver.findElement(By.id("draggable"));
		 WebElement dropZone1 =driver.findElement(By.id("droppable"));
		 WebElement dropZone2 =driver.findElement(By.id("dropzone2"));
		 actions.dragAndDrop(ball, dropZone1).perform();
		 
		 wait.until(ExpectedConditions.attributeToBeNotEmpty(dropZone1,"background-color" ));
		 System.out.println("Ball entered zone1");
		 actions.dragAndDrop(ball, dropZone2).perform();
		 wait.until(ExpectedConditions.attributeToBeNotEmpty(dropZone2,"background-color" ));
		 System.out.println("Ball entered zone2");
	}

}
