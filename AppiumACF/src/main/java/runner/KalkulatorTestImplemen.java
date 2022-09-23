package runner;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import packageobject.TestCalculator;

public class KalkulatorTestImplemen {
	
	private static AndroidDriver<MobileElement> driver;
	private TestCalculator calculator;
	
	
	@BeforeClass
	public void setUp() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "ASUS Z01QD");
		capabilities.setCapability("uuid", "127.0.0.1:21513");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "7.1.2");
		capabilities.setCapability("appPackage", "com.dencreak.dlcalculator");
		capabilities.setCapability("appActivity", "com.dencreak.dlcalculator.DLCalculatorActivity");//automationName
//		capabilities.setCapability("automationName", "UiAutomator2");
//		capabilities.setCapability("appWaitDuration", "600");
//		capabilities.setCapability("adbExecTimeout", "600");
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//		System.out.println("DRIVER : "+driver);
	}

}
