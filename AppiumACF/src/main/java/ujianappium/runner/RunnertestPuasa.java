package ujianappium.runner;

import java.awt.AWTException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import ujianappium.pageobject.DiaryPuasa;

public class RunnertestPuasa {
	
	private static AndroidDriver<MobileElement> driver;
	private DiaryPuasa drPuasa;
	
	@BeforeMethod
	public void befTest()
	{
		
		try {
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("deviceName", "ASUS_Z01QD");
			capabilities.setCapability("uuid", "127.0.0.1:21513");
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("platformVersion", "7.1.2");
			capabilities.setCapability("appPackage", "com.ckcdev.www.hitungkalori");
			capabilities.setCapability("appActivity", "com.ckcdev.www.hitungkalori.DiaryActivity");
			
			driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			
			drPuasa = new DiaryPuasa(driver);
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority=1)
	public void testValidDiaryMakanan()throws InterruptedException {
		drPuasa.PagePuasa("48", "157", "23", "45");
		AssertJUnit.assertEquals(drPuasa.getTxtFinalPuasa(), "Sahur");
	}

}
