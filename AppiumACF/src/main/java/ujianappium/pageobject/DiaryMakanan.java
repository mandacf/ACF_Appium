package ujianappium.pageobject;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class DiaryMakanan {
	
	public AndroidDriver<MobileElement> driver;
		
	
	public DiaryMakanan(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout")
	private MobileElement btnDiary;
	
	@AndroidFindBy(id = "com.ckcdev.www.hitungkalori:id/ll_jenis_kelamin_cek_kalori_laki")
	private MobileElement btnLk;
	
	@AndroidFindBy(id = "com.ckcdev.www.hitungkalori:id/txtBerat")
	private MobileElement txtBerat;
	
	@AndroidFindBy(id = "com.ckcdev.www.hitungkalori:id/txtTinggi")
	private MobileElement txtTinggi;
	
	@AndroidFindBy(id = "com.ckcdev.www.hitungkalori:id/txtUsia")
	private MobileElement txtUsia;
	
	@AndroidFindBy(id = "com.ckcdev.www.hitungkalori:id/ll_aktifitas_2")
	private MobileElement txtAktifitas2;
	

	
	@AndroidFindBy(id = "com.ckcdev.www.hitungkalori:id/etTargetBerat")
	private MobileElement txtTarget;
	
	@AndroidFindBy(id = "com.ckcdev.www.hitungkalori:id/title")
	private MobileElement txtFinal;
	
	@AndroidFindBy(id = "android:id/button1")
	private MobileElement btnOk;
	
	@AndroidFindBy(id = "com.ckcdev.www.hitungkalori:id/btnNextCekKalori")
	private MobileElement btnNextCekKalori;
	
	@AndroidFindBy(id = "com.ckcdev.www.hitungkalori:id/btnNextCekKalori2")
	private MobileElement btnNextCekKalori2;
	
	@AndroidFindBy(id = "com.ckcdev.www.hitungkalori:id/btnOKCekKalori3")
	private MobileElement btnNextCekKalori3;
	
	public void PageDiary(String txtHitBerat, String txtHitTinggi, String txtUsia, String txtTarget) throws InterruptedException {
		btnDiary.click();
		Thread.sleep(1000);
		btnLk.click();
		this.txtBerat.sendKeys(String.valueOf(txtHitBerat));
		Thread.sleep(1000);
		this.txtTinggi.sendKeys(String.valueOf(txtHitTinggi));
		Thread.sleep(1000);
		this.txtUsia.sendKeys(String.valueOf(txtUsia));
		Thread.sleep(1000);
		btnNextCekKalori.click();
		Thread.sleep(1000);
		txtAktifitas2.click();
		Thread.sleep(1000);
		btnNextCekKalori2.click();
		this.txtTarget.sendKeys(String.valueOf(txtTarget));
		Thread.sleep(1000);
		btnNextCekKalori3.click();
		btnOk.click();
	}
	
	public String getTxtFinal() {
		return txtFinal.getText();
	}
	

}
