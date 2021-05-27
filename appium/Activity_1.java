package activites;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity_1 {
	AppiumDriver<MobileElement> driver = null;

	@Test

	public void test() throws MalformedURLException {

		// Set the Desired Capabilities

		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability("deviceName", "Pixel4");

		caps.setCapability("platformName", "android");

		caps.setCapability("automationName", "UiAutomator2");

		caps.setCapability("appPackage", "com.android.calculator2");

		caps.setCapability("appActivity", "com.android.calculator2.Calculator");

		//        caps.setCapability("noReset", true);



		// Instantiate Appium Driver

		URL appServer = new URL("http://0.0.0.0:4723/wd/hub");

		driver = new AndroidDriver<MobileElement>(appServer, caps);
		System.out.println("Calculator is opened");

	}
}
