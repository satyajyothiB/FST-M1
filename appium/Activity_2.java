package activites;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.Assert;

public class Activity_2 {
	AppiumDriver<MobileElement> driver = null;

	@BeforeTest
	public void setUp() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Pixel4");
		caps.setCapability("platformName", "android");
		caps.setCapability("automationName", "UiAutomator2");
		caps.setCapability("appPackage", "com.android.chrome");
		caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
		caps.setCapability("noReset", true);
		URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(appServer, caps);
	}

	@Test

	public void aboutUsLink() {
		driver.get("https://www.training-support.net/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		MobileElement title = driver.findElementByXPath("//android.view.View[@text='Training Support']");

		String pageTitle = title.getText();
		System.out.println("The page Title is: " +title.getText());

		Assert.assertEquals(pageTitle, "Training Support");

		MobileElement aboutUsBtn = driver.findElementByXPath("//android.view.View[4][@resource-id='about-link']");
		aboutUsBtn.click();

		String newTitle = driver.findElementByXPath("//android.view.View[2][@text='About Us']").getText();

		System.out.println("The New page Title is: " + newTitle);
		Assert.assertEquals(newTitle, "About Us");   
	}
	@AfterTest 
	public void closeDriver() {
		driver.quit();
	}

}