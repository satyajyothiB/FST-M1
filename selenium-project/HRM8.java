package HRMProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HRM8 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver Driver = new ChromeDriver();
		
		Driver.navigate().to("http://alchemy.hguy.co/orangehrm");
		
		WebElement UserName = Driver.findElement(By.xpath("//input[@id='txtUsername']"));
		WebElement Password = Driver.findElement(By.xpath("//input[@id='txtPassword']"));
		
		UserName.sendKeys("orange");
		Thread.sleep(2000);
		
		Password.sendKeys("orangepassword123");
		Thread.sleep(2000);
		
		Driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Thread.sleep(2000);
		
		Driver.findElement(By.xpath("(//a[@target='_self'])[4]")).click();
		Thread.sleep(2000);
		
		Select LeaveType = new Select(Driver.findElement(By.id("applyleave_txtLeaveType")));
		LeaveType.selectByVisibleText("Paid Leave");
		
		WebElement LeaveFromDate = Driver.findElement(By.id("applyleave_txtFromDate"));
		LeaveFromDate.clear();
		LeaveFromDate.sendKeys("2021-05-05");
		Thread.sleep(2000);
		
		WebElement LeaveToDate = Driver.findElement(By.id("applyleave_txtToDate"));
		LeaveToDate.clear();
		LeaveToDate.sendKeys("2021-05-05");
		Thread.sleep(2000);
		
		WebElement Comment = Driver.findElement(By.id("applyleave_txtComment"));
		Comment.sendKeys("Apply Leaves for Cheryl");
		Thread.sleep(2000);
		
		Select LeaveDuration = new Select(Driver.findElement(By.id("applyleave_duration_duration")));
		LeaveDuration.selectByVisibleText("Half Day");
		Thread.sleep(2000);
		
		Driver.findElement(By.xpath("//input[@id='applyBtn']")).click();
		Thread.sleep(2000);
		
		Driver.findElement(By.id("menu_leave_viewMyLeaveList")).click();
		Thread.sleep(2000);
		
		WebElement CalFromDate = Driver.findElement(By.id("calFromDate"));
		CalFromDate.clear();
		CalFromDate.sendKeys("2021-05-05");
		Thread.sleep(2000);
		
		WebElement CalToDate = Driver.findElement(By.id("calToDate"));
		CalToDate.clear();
		CalToDate.sendKeys("2021-05-05");
		Thread.sleep(2000);
		
		Driver.findElement(By.id("btnSearch")).click();
		Thread.sleep(2000);
		String LeaveStatus = Driver.findElement(By.xpath("(//td[@class='left']/a)[3]")).getText();
		Thread.sleep(2000);
		System.out.println(LeaveStatus);
		Thread.sleep(2000);
		
		Driver.close();////
	}

}
