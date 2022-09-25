package ujianappium.runner;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import ujianappium.pageobject.DiaryMakanan;

public class RunnerTestDiary {
	
	private static AndroidDriver<MobileElement> driver;
	private DiaryMakanan drMakanan;
	
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
			
			drMakanan = new DiaryMakanan(driver);
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority=1)
	public void testValidDiaryMakanan()throws InterruptedException {
		drMakanan.PageDiary("48", "157", "23", "45");
		AssertJUnit.assertEquals(drMakanan.getTxtFinal(), "Tanggal Diary");
	}

}
