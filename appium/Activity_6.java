package activites;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.Assert;

public class Activity_6 {
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
	public void imageScroll() {

		driver.get("https://www.training-support.net/selenium/lazy-loading");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		MobileElement title = driver.findElementByXPath("//android.view.View[2][@text='Lazy Loading']");

		String pageTitle = title.getText();
		System.out.println("The page Title is: " + pageTitle);

		Assert.assertEquals(pageTitle, "Lazy Loading");

		List<MobileElement> numberOfImages = driver.findElementsByXPath("//android.view.View/android.view.View/android.widget.Image");

		System.out.println("Number of image shown currently: " + numberOfImages.size());

		driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(new UiSelector().scrollable(true)).scrollTextIntoView(\"helen\")"));

		numberOfImages = driver.findElementsByXPath("//android.view.View/android.view.View/android.widget.Image");

		System.out.println("Number of image shown currently: " + numberOfImages.size());
	}

	@AfterTest 
	public void closeDriver() {
		driver.quit();
	}
}