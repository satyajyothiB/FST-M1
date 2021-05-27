package SeleniumActivities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 WebDriver driver= new FirefoxDriver();
 driver.get("https://training-support.net/selenium/tables");
 
 List<WebElement> cols = driver.findElements(By.xpath("//table[@id='sortableTable']/thead/tr/th"));
 List<WebElement> rows = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr"));
	System.out.println("No of columns is "+cols.size());
	System.out.println("No of rows is "+rows.size());
System.out.println("second row and second column is "+driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]")).getText());
driver.findElement(By.xpath("//table[@id='sortableTable']/thead/tr/th[1]")).click();
System.out.println("after sort second row and second column is "+driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]")).getText());
driver.quit();
	}

}
