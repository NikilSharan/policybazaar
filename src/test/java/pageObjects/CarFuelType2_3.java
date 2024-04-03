package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarFuelType2_3 extends basePage {

	public CarFuelType2_3(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//*[@id=\"Petrol\"]")
	//*[@id="Diesel"]
	WebElement petrolType;
	
	@FindBy(xpath = "//*[@id=\"Diesel\"]")
	WebElement dieselType;
	
	
	public void SelectingFuelType(String user_fuel_choice) {
		
		if(user_fuel_choice.equalsIgnoreCase("petrol")) {
			petrolType.click();
		}
		
		if(user_fuel_choice.equalsIgnoreCase("diesel")) {
			dieselType.click();
		}
	}
}
