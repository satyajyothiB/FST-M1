package SeleniumActivities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver= new FirefoxDriver();
		 driver.get("https://training-support.net/selenium/selects");
		 Select multiSelect = new Select(driver.findElement(By.id("multi-select")));
		 if (multiSelect.isMultiple()){
			multiSelect.selectByValue("javascript"); 
			multiSelect.selectByVisibleText("NodeJS");
			multiSelect.selectByIndex(2);
			multiSelect.deselectByValue("node");
			multiSelect.deselectByIndex(2);
			System.out.println(multiSelect.getFirstSelectedOption().getText());
			
			List<WebElement> allselection=multiSelect.getAllSelectedOptions();
			for(WebElement a :allselection) {
				System.out.println("Selection value is " + a.getText());
			}
			multiSelect.deselectAll();
						
		 }
		 driver.close();
		 
	}

}
