package ujianappium.pageobject;

import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class DiaryPuasa {
	
public AndroidDriver<MobileElement> driver;
		
	
	public DiaryPuasa(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout")
	private MobileElement btnDiary;
	
	@AndroidFindBy(id = "com.ckcdev.www.hitungkalori:id/ll_jenis_kelamin_cek_kalori_perempuan")
	private MobileElement btnPr;
	
	@AndroidFindBy(id = "com.ckcdev.www.hitungkalori:id/txtBerat")
	private MobileElement txtBerat;
	
	@AndroidFindBy(id = "com.ckcdev.www.hitungkalori:id/txtTinggi")
	private MobileElement txtTinggi;
	
	@AndroidFindBy(id = "com.ckcdev.www.hitungkalori:id/txtUsia")
	private MobileElement txtUsia;
	
	@AndroidFindBy(id = "com.ckcdev.www.hitungkalori:id/btnNextCekKalori")
	private MobileElement btnNext;
	
	@AndroidFindBy(id = "com.ckcdev.www.hitungkalori:id/ll_aktifitas_3")
	private MobileElement btnAktifitas3;
	
	@AndroidFindBy(id = "com.ckcdev.www.hitungkalori:id/btnNextCekKalori2")
	private MobileElement btnNext2;
	
	@AndroidFindBy(id = "com.ckcdev.www.hitungkalori:id/etTargetBerat")
	private MobileElement txtTarget;
	
	@AndroidFindBy(id = "com.ckcdev.www.hitungkalori:id/btnOKCekKalori3")
	private MobileElement btnOkCek;
	
	@AndroidFindBy(id = "android:id/button1")
	private MobileElement btnSatu;
	
	@AndroidFindBy(id = "com.ckcdev.www.hitungkalori:id/tvMakanPagi")
	private MobileElement txtKalori;
	
	public void PagePuasa(String txtHitBerat, String txtHitTinggi, String txtUsia, String txtTarget) throws InterruptedException {
		btnDiary.click();
		Thread.sleep(1000);
		btnPr.click();
		Thread.sleep(1000);
		this.txtBerat.sendKeys(String.valueOf(txtHitBerat));
		Thread.sleep(1000);
		this.txtTinggi.sendKeys(String.valueOf(txtHitTinggi));
		Thread.sleep(1000);
		this.txtUsia.sendKeys(String.valueOf(txtUsia));
		Thread.sleep(1000);
		btnNext.click();
		Thread.sleep(1000);
		btnAktifitas3.click();
		Thread.sleep(1000);
		btnNext2.click();
		this.txtTarget.sendKeys(String.valueOf(txtTarget));
		Thread.sleep(1000);
		btnOkCek.click();
		btnSatu.click();
	}
	
	public String getTxtFinalPuasa() {
		return txtKalori.getText();
	}

}
