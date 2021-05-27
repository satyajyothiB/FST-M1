package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity12 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new FirefoxDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://www.training-support.net/selenium/iframes");
		System.out.println("The title of the page "+driver.getTitle());
		driver.switchTo().frame(0);
		
		System.out.println("heading of 1st iframe is "+driver.findElement(By.xpath("//div[@class='content']")).getText());
		
		WebElement button1 =driver.findElement(By.xpath("//button[contains(text(),'Click Me!')]"));
		System.out.println("Text on Button1 is "+button1.getText());
		System.out.println("The background color of button1 is "+button1.getCssValue("background-color"));
		button1.click();
		System.out.println("Text on Button1 after click is "+button1.getText());
		System.out.println("The background color of button1 after click is "+button1.getCssValue("background-color"));
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		Thread.sleep(5000);
		 js.executeScript("window.scrollBy(0,1000)");
		System.out.println("heading of 2nd iframe is "+driver.findElement(By.xpath("//div[@class='content']")).getText());
		
		WebElement button2 =driver.findElement(By.xpath("//button[contains(text(),'Click Me!')]"));
		System.out.println("Text on Button2 is "+button2.getText());
		System.out.println("The background color of button2 is "+button2.getCssValue("background-color"));
		//Thread.sleep(5000);
		button2.click();
		Thread.sleep(1000);
		
		System.out.println("Text on Button2 after click is "+button2.getText());
		System.out.println("The background color of button2 after click is "+button2.getCssValue("background-color"));
		driver.switchTo().defaultContent();
		
		driver.close();
		
	}
	

}
