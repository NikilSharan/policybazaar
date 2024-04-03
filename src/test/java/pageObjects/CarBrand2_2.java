package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarBrand2_2 extends basePage {

	public CarBrand2_2(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//*[@id=\"react-autowhatever-1--item-0\"]/span")
	//*[@id="react-autowhatever-1--item-1"]/span
	//*[@id="react-autowhatever-1--item-17"]/span
	
	//the numbers are changing for each list item
	WebElement carModel;
	
	
	public void SelectingCarModel() {
		carModel.click();
	}

}
