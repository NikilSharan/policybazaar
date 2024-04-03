package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Destination1_1 extends basePage {

	public Destination1_1(WebDriver driver) {
		super(driver);	
	}
	
	@FindBy(xpath = "//*[@id=\"country\"]")
	WebElement inputField;
	
	@FindBy(xpath = "//*[@id=\"prequote-wrapper\"]/div[2]/div/div[2]/button")
	WebElement nextBtn;
	
	
	public void passingCountryInput() {
		inputField.sendKeys("France");
	}
	
	public void clickingBtn1() {
		nextBtn.click();
	}
	


}
