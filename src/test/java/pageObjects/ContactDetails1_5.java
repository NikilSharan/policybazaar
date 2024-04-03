package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactDetails1_5 extends basePage {

	public ContactDetails1_5(WebDriver driver) {
		super(driver);	
	}
	
	@FindBy(xpath = "//*[@id=\"mobileNumber\"]")
	WebElement inputField;
	
	@FindBy(xpath = "//*[@id=\"prequote-wrapper\"]/div[2]/div/div[2]/div/button")
	WebElement viewPlanBtn;
	
	@FindBy(xpath = "//*[@id=\"whatsapp-updates\"]")
	WebElement toggleBtn;
	
	
	
	
//	public void selectInputField() {
//		inputField.click();
//	}
	
	public void PassingInput() {
		inputField.sendKeys("987654321");
	}
	
	public void clickingBtn5() {
		//it is checkbox input type
		viewPlanBtn.click();
	}
	
	public void switchToggle() {
		toggleBtn.click();
	}

}
