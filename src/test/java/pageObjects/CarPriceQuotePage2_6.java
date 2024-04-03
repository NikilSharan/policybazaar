package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarPriceQuotePage2_6 extends basePage {

	public CarPriceQuotePage2_6(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//*[@id=\"before-tp\"]/div[2]/a")
	
	// USING XPATH BELOW
	//*[@id="root"]/section/div/div/div[2]/div/div/div[2]/div[2]/label/div/div/div[1]/p
	//*[@id="root"]/section/div/div/div[2]/div/div/div[2]/div[3]/label/div/div/div[1]/p
	//*[@id="root"]/section/div/div/div[2]/div/div/div[2]/div[4]/label/div/div/div[1]/p
	
	//USING CLASS BELOW
	//*[@class='text' and @class='fontMedium']
	WebElement newCarBtn;
	
	
	public void clickingBtn() {
		newCarBtn.click();
	}

}
