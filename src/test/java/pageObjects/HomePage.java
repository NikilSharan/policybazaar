package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends basePage {

	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "/html/body/main/div[2]/section/div[7]/a")
	WebElement TravelInsuranceSelect;
	
	@FindBy(xpath = "/html/body/main/div[2]/section/div[4]/a")
	WebElement CarInsuranceSelect;
	
	@FindBy(xpath = "/html/body/div[5]/div[2]/div/ul/li[2]/a")
	WebElement InsuranceProducts;
	
	@FindBy(xpath = "/html/body/div[5]/div[2]/div/ul/li[1]/a")
	WebElement HomePageLogo;
	
	
	public void clicking_TravelInsurance() {
		TravelInsuranceSelect.click();
	}
	
	public void clicking_CarInsurance() {
		CarInsuranceSelect.click();
	}
	
	public void Hovering_InsuranceProducts() {
		Actions act =  new Actions(driver);
		act.moveToElement(InsuranceProducts).click().perform();
	}
	
	public void Navigating_to_HomePage() {
		HomePageLogo.click();
	}
	

}
