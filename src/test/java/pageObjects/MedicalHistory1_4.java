package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MedicalHistory1_4 extends basePage {

	public MedicalHistory1_4(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//*[@id=\"ped_yes\"]")
	WebElement YesBtn;
	
	@FindBy(xpath = "//*[@id=\"ped_no\"]")
	WebElement NoBtn;
	
	@FindBy(xpath = "//*[@id=\"1\"]")
	WebElement person2age;
	
	@FindBy(xpath = "//*[@id=\"ped_yes_traveller_0\"]")
	WebElement medCondition1;
	
	@FindBy(xpath = "//*[@id=\"ped_yes_traveller_1\"]")
	WebElement medCondition2;
	
	//@FindBy(xpath = "")
	//WebElement nextBtn;
	
	
	public void selectingYes() {
		YesBtn.click();
	}
	
	public void selectingNo() {
		YesBtn.click();
	}
	
	public void selectingPerson1() {
		medCondition1.click();
	}
	
	public void selectingPerson2() {
		medCondition2.click();
	}

}
