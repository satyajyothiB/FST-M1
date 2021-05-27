package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new FirefoxDriver();	
		driver.get("https://www.training-support.net/selenium/target-practice");
		String pageTitle =driver.getTitle();
		System.out.println(pageTitle);
 WebElement thirdHeader =driver.findElement(By.xpath("//h3[@id='third-header']"));
 System.out.println("The third header is "+thirdHeader.getText());
 WebElement fifthHeader =driver.findElement(By.xpath("//h5[contains(text(),'Fifth header')]"));
 System.out.println("The color css value of 5th header is " +fifthHeader.getCssValue("color"));
 WebElement violetButton =driver.findElement(By.xpath("//button[contains(text(),'Violet')]"));
 System.out.println("The class attribues of violet button are " +violetButton.getAttribute("class"));
 System.out.println("Grey Button name is "+driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText());
driver.close();
	}

}
