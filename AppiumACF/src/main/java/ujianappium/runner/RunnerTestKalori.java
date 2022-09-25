package ujianappium.runner;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import contoh.utils.ExcelReader;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import latihan.pageobject.CalcDestroyer;
import ujianappium.pageobject.Kalori;

public class RunnerTestKalori {
	
	private static AndroidDriver<MobileElement> driver;
	private Kalori kalori;
	
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
			capabilities.setCapability("appActivity", "com.ckcdev.www.hitungkalori.BMICalculatorActivity");
			
			driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			
			kalori = new Kalori(driver);
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	
	
	@Test(priority=1)
	public void testValidHitBMIL()throws InterruptedException {
		kalori.PageBMIL("48", "157");
		AssertJUnit.assertEquals(kalori.getTxtMsg(), "Menjaga berat badan yang sehat dapat mengurangi risiko penyakit kronis yang terkait dengan kelebihan berat badan dan obesitas.");
	}
	
	
	@Test(priority=2)
	public void testValidHitBMIP()throws InterruptedException {
		kalori.PageBMIP("88", "160");
		AssertJUnit.assertEquals(kalori.getTxtMsg(), "Menjaga berat badan yang sehat dapat mengurangi risiko penyakit kronis yang terkait dengan kelebihan berat badan dan obesitas.");
	}
	
	@Test(priority=3)
	public void testInValidHitBMIP()throws InterruptedException {
		kalori.PageBMIPInvalid("88");
		AssertJUnit.assertEquals(kalori.getTxtBeranda(), "");
	}
	
	
	@AfterMethod
	public void Close() {
		driver.quit();
	}
	
	
	
	

}
