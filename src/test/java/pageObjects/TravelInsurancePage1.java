package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TravelInsurancePage1 extends basePage {
	
	public TravelInsurancePage1(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//*[@id=\"component_1\"]/div/div[2]/div/div[1]/div/button")
	WebElement CruiseLine;
	
	@FindBy(xpath = "//*[@id=\"component_1\"]/div/div[2]/div/div[2]/div/button")
	WebElement CruiseShip;
	
	@FindBy(xpath = "//*[@id=\"component_1\"]/div/div[2]/div/div[3]/span/button")
	WebElement SearchBtn;
	
	
	public void Clicking_CruiseLine() {
		CruiseLine.click();
	}
	
	public void Clicking_CruiseShip() {
		CruiseShip.click();
	}
	
	public void Clicking_CruiseSearchBtn() {
		CruiseShip.click();
	}

}
