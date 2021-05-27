package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver= new FirefoxDriver();
		 driver.get("https://training-support.net/selenium/selects");
		 
		 WebElement chosen = driver.findElement(By.id("single-value"));
		WebElement dropdown=driver.findElement(By.id("single-select"));
		Select dropdownSelect = new Select(dropdown);
		
		//selecting second value
		dropdownSelect.selectByVisibleText("Option 2");
		System.out.println(chosen.getText());
		
		
		//selecting 3rd value
		dropdownSelect.selectByIndex(3);;
		System.out.println(chosen.getText());
				
		//selecting 4th value
		dropdownSelect.selectByValue("4");
		System.out.println(chosen.getText());
		
		 driver.quit();
	}

}
