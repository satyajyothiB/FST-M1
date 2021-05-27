package SeleniumActivities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new FirefoxDriver();
		driver.get(" https://training-support.net/selenium/tables");
        System.out.println(driver.getTitle());
        List<WebElement> staticRow1 = driver.findElements(By.xpath("//table[contains(@class,'striped')]/tbody/tr[1]/td"));
        System.out.println("No of columns in static table are "+staticRow1.size());
        List<WebElement> staticRow3 = driver.findElements(By.xpath("//table[contains(@class,'striped')]/tbody/tr[3]"));
       // Values in third row
        for(WebElement x: staticRow3) {
        	System.out.println("cell value is "+x.getText());
        	}
        System.out.println("The value of 2nd row and 2nd column is "+driver.findElement(By.xpath("//table[contains(@class,'striped')]/tbody/tr[2]/td[2]")).getText());

        driver.close();
	}

}
