package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomerDetails2_5 extends basePage{

	public CustomerDetails2_5(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//*[@id=\"name\"]")
	WebElement name;
	
	@FindBy(xpath = "//*[@id=\"email\"]")
	WebElement email;
	
	@FindBy(xpath = "//*[@id=\"mobileNo\"]")
	WebElement mobileNo;
	
	@FindBy(xpath = "//*[@id=\"dvVariant\"]/div[2]/div[3]/label/input")
	//*[@id="dvVariant"]/div[2]/div[3]/label/span   --> try this if above not working
	WebElement toggleBtn;
	
	@FindBy(xpath = "//*[@id=\"btnLeadDetails\"]")
	WebElement viewPricesBtn;
	
	
	public void PassingNameInput(String Name) {
		name.sendKeys(Name);
	}
	
	public void PassingEmailInput(String Email) {
		email.sendKeys(Email);
	}
	
	public void PassingMobileNoInput(CharSequence[] Number) {
		mobileNo.sendKeys(Number);
	}
	
	public void SwitchingToggleBtn() {
		toggleBtn.click();
	}
	
	public void ClickingPriceBtn() {
		viewPricesBtn.click();
	}
	
	

}
