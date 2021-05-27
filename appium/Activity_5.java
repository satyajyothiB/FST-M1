package activites;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import junit.framework.Assert;

public class Activity_5 {
	AppiumDriver<MobileElement> driver = null;

	@BeforeTest
	public void setUp() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Pixel4");
		caps.setCapability("platformName", "android");
		caps.setCapability("automationName", "UiAutomator2");
		caps.setCapability("appPackage", "com.google.android.apps.messaging");
		caps.setCapability("appActivity", ".ui.ConversationListActivity");
		caps.setCapability("noReset", true);

		URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(appServer, caps);

	}

	@Test
	public void sendMsg() {

		driver.findElementByAccessibilityId("Start new conversation").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MobileElement searchContact = driver.findElementById("recipient_text_view");
		searchContact.sendKeys("1234567890");
		((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MobileElement enterMsg = driver.findElementById("compose_message_text");
		enterMsg.sendKeys("Hi, from Appium Test");
		MobileElement sendBtn = driver.findElementById("send_message_button_container");
		Assert.assertTrue(sendBtn.isEnabled());
		sendBtn.click();
	}

	@AfterTest 
	public void closeDriver() {
		driver.quit();
	}
}