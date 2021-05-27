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
import junit.framework.Assert;

public class Activity_4 {

	AppiumDriver<MobileElement> driver = null;

	@BeforeTest
	public void setUp() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Pixel4");
		caps.setCapability("platformName", "android");
		caps.setCapability("automationName", "UiAutomator2");
		caps.setCapability("appPackage", "com.android.contacts");
		caps.setCapability("appActivity", ".activities.PeopleActivity");
		caps.setCapability("noReset", true);

		URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(appServer, caps);

	}

	@Test
	public void addContact() {

		driver.findElementByAccessibilityId("Create new contact").click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		MobileElement firstName = driver.findElementByXPath("//android.widget.EditText[@text='First name']");
		firstName.sendKeys("Radha");
		MobileElement lastName = driver.findElementByXPath("//android.widget.EditText[@text='Last name']");
		lastName.sendKeys("B");
		MobileElement phoneNo = driver.findElementByXPath("//android.widget.EditText[@text='Phone']");
		phoneNo.sendKeys("9999999999");

		MobileElement saveBtn = driver.findElementById("editor_menu_save_button");
		saveBtn.click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		MobileElement mobileCard = driver.findElementById("action_bar_gradient");
		Assert.assertTrue(mobileCard.isDisplayed());

		MobileElement savedContactName = driver.findElementById("title_gradient");
		Assert.assertTrue(savedContactName.isDisplayed());
		System.out.println("New Conatct added");

	}

	@AfterTest 
	public void closeDriver() {
		driver.quit();
	}
}