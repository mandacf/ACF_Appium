package packageobject;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;




public class TestCalculator {
	
	public AndroidDriver<MobileElement> driver;
	private double doubExpected=0.0;	
	
	public TestCalculator(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	
	@AndroidFindBy(id = "com.dencreak.dlcalculator:id/pad_btn_e_a")
	private MobileElement btnNol;
	@AndroidFindBy(id = "com.dencreak.dlcalculator:id/pad_btn_d_a")
	private MobileElement btnSatu;
	@AndroidFindBy(id = "com.dencreak.dlcalculator:id/pad_btn_d_b")
	private MobileElement btnDua;
	@AndroidFindBy(id = "com.dencreak.dlcalculator:id/pad_btn_d_c")
	private MobileElement btnTiga;
	@AndroidFindBy(id = "com.dencreak.dlcalculator:id/pad_btn_c_a")
	private MobileElement btnEmpat;
	@AndroidFindBy(id = "com.dencreak.dlcalculator:id/pad_btn_c_b")
	private MobileElement btnLima;
	@AndroidFindBy(id = "com.dencreak.dlcalculator:id/pad_btn_c_c")
	private MobileElement btnEnam;
	@AndroidFindBy(id = "com.dencreak.dlcalculator:id/pad_btn_b_a")
	private MobileElement btnTujuh;
	@AndroidFindBy(id = "com.dencreak.dlcalculator:id/pad_btn_b_b")
	private MobileElement btnDelapan;
	@AndroidFindBy(id = "com.dencreak.dlcalculator:id/pad_btn_b_c")
	private MobileElement btnSembilan;
	
	// locator aritmatika
	@AndroidFindBy(id = "com.dencreak.dlcalculator:id/pad_img_d_d")
	private MobileElement btnAdd;
	@AndroidFindBy(id = "com.dencreak.dlcalculator:id/pad_img_c_d")
	private MobileElement btnMinus;
	@AndroidFindBy(id = "com.dencreak.dlcalculator:id/pad_img_b_d")
	private MobileElement btnMultiply;
	@AndroidFindBy(id = "com.dencreak.dlcalculator:id/pad_img_a_d")
	private MobileElement btnDivide;
	@AndroidFindBy(id = "com.dencreak.dlcalculator:id/pad_img_e_d")
	private MobileElement btnEquals;
	@AndroidFindBy(id = "com.dencreak.dlcalculator:id/lay_normal_body_back")
	private MobileElement btnClear;
		
	// locator result
	@AndroidFindBy(id = "com.dencreak.dlcalculator:id/lay_normal_body_val")
	private MobileElement hasilCalc;
		
		
		
		public void addNilai(){
		btnEmpat.click();
		btnAdd.click();
		btnLima.click();
		btnEquals.click();
		}
		
		public void kurangNilai(){
		btnSatu.click();
		btnAdd.click();
		btnNol.click();
		btnEquals.click();
		}
	
		public void bagiNilai(){
		btnDua.click();
		btnAdd.click();
		btnDua.click();
		btnEquals.click();
		}
		
		public void perkalianNilai(){
		btnDua.click();
		btnAdd.click();
		btnDua.click();
		btnEquals.click();
		}
		
		public String result() {
			return hasilCalc.getText();
		}
	


}
