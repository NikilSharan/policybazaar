package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarInsurancePage2 extends basePage {
	
	public CarInsurancePage2(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//*[@id=\"before-tp\"]/div[2]/a")
	WebElement newCarBtn;
	
	public void clickingBtn() {
		newCarBtn.click();
	}

}
