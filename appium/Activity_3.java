package activites;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.Assert;

public class Activity_3 {
AppiumDriver<MobileElement> driver = null;
	
	@BeforeTest
	public void setUp() throws MalformedURLException {
	      DesiredCapabilities caps = new DesiredCapabilities();
	      caps.setCapability("deviceName", "Pixel4");
	      caps.setCapability("platformName", "android");
	      caps.setCapability("automationName", "UiAutomator2");
	      caps.setCapability("appPackage", "com.android.calculator2");
	      caps.setCapability("appActivity", "com.android.calculator2.Calculator");
	      caps.setCapability("noReset", true);
	      URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
	      driver = new AndroidDriver<MobileElement>(appServer, caps);	
	}
	
	@Test
	public void addition() {
		driver.findElementById("digit_5").click();
		driver.findElementById("op_add").click();
		driver.findElementById("digit_9").click();
		driver.findElementById("eq").click();
		
		String result = driver.findElementById("result").getText();
		System.out.println("The addition is: " + result);
		Assert.assertEquals("14", result);
		
	}
	
	@Test
	public void subtraction() {
		driver.findElementById("digit_1").click();
		driver.findElementById("digit_0").click();
		driver.findElementById("op_sub").click();
		driver.findElementById("digit_5").click();
		driver.findElementById("eq").click();
		
		String result = driver.findElementById("result").getText();
		System.out.println("The Subtraction is: " + result);
		Assert.assertEquals("5", result);
		
	}
	
	@Test
	public void multiply() {
		driver.findElementById("digit_5").click();
		driver.findElementById("op_mul").click();
		driver.findElementById("digit_1").click();
		driver.findElementById("digit_0").click();
		driver.findElementById("digit_0").click();
		
		driver.findElementById("eq").click();
		
		String result = driver.findElementById("result").getText();
		System.out.println("The Multiply is: " + result);
		Assert.assertEquals("500", result);
		
	}
	@Test
	public void division() {
		driver.findElementById("digit_5").click();
		driver.findElementById("digit_0").click();
		driver.findElementById("op_div").click();
		driver.findElementById("digit_2").click();
		
		driver.findElementById("eq").click();
		
		String result = driver.findElementById("result").getText();
		System.out.println("The Subtraction is: " + result);
		Assert.assertEquals("25", result);
		
	}
	
	@AfterTest 
	public void closeDriver() {
		driver.quit();
	}
}