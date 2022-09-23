package ujianappium.pageobject;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Kalori {
	
	public AndroidDriver<MobileElement> driver;
	private double doubExpected=0.0;	
	
	public Kalori(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	

//	@AndroidFindBy(xpath ="//android.widget.LinearLayout[@resource-id="com.ckcdev.www.hitungkalori:id/ll_jenis_kelamin_bmi_laki\"]")
//	private MobileElement btnHitKalori;
	@AndroidFindBy(id = "com.ckcdev.www.hitungkalori:id/ll_jenis_kelamin_bmi_laki")
	private MobileElement btnHitKaloriLK;
	
	@AndroidFindBy(id = "com.ckcdev.www.hitungkalori:id/ll_jenis_kelamin_bmi_perempuan")
	private MobileElement btnHitKaloriPR;
	
	@AndroidFindBy(id = "com.ckcdev.www.hitungkalori:id/et_berat_bmi")
	private MobileElement txtHitBerat;
	
	@AndroidFindBy(id = "com.ckcdev.www.hitungkalori:id/et_tinggi_bmi")
	private MobileElement txtHitTinggi;
	
	@AndroidFindBy(id = "com.ckcdev.www.hitungkalori:id/btnHitungBMI")
	private MobileElement btnHitung;
	
	@AndroidFindBy(id = "com.ckcdev.www.hitungkalori:id/tv_bmi_par3")
	private MobileElement txtHasil;
	
	@AndroidFindBy(id = "com.ckcdev.www.hitungkalori:id/btnHitungUlangBMI")
	private MobileElement btnKembali;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]")
	private MobileElement txtBeranda;
	
	public void PageBMIL(String txtHitBerat, String txtHitTinggi) throws InterruptedException {
		btnHitKaloriLK.click();
		this.txtHitBerat.sendKeys(String.valueOf(txtHitBerat));
		Thread.sleep(1000);
		this.txtHitTinggi.sendKeys(String.valueOf(txtHitTinggi));
		Thread.sleep(1000);
		btnHitung.click();
	}
	
	public void PageBMIP(String txtHitBerat, String txtHitTinggi) throws InterruptedException {
		btnHitKaloriPR.click();
		this.txtHitBerat.sendKeys(String.valueOf(txtHitBerat));
		Thread.sleep(1000);
		this.txtHitTinggi.sendKeys(String.valueOf(txtHitTinggi));
		Thread.sleep(1000);
		btnHitung.click();
	}
	
	public void PageBMIPInvalid(String txtHitBerat) throws InterruptedException {
		btnHitKaloriPR.click();
		this.txtHitBerat.sendKeys(String.valueOf(txtHitBerat));
		Thread.sleep(1000);
		btnHitung.click();
	}
	
	public void PageBMIPInvalid2(String txtHitTinggi) throws InterruptedException {
		btnHitKaloriPR.click();
		this.txtHitTinggi.sendKeys(String.valueOf(txtHitTinggi));
		Thread.sleep(1000);
		btnHitung.click();
	}
	
	public String getTxtMsg() {
		return txtHasil.getText();
	}
	
	public String getClose() {
		return btnKembali.getText();
	}
	
	public String getTxtBeranda() {
		return  txtBeranda.getText();
	}

}
