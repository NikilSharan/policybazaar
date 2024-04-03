package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TravelInsPlanPage1_6 extends basePage {

	public TravelInsPlanPage1_6(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/aside/section[1]/details/summary/p")
	WebElement sortByBtn;
	
	@FindBy(how = How.CLASS_NAME, using = "quotesCard--insurerName")
	WebElement insuranceProvider;
	
	@FindBy(how = How.CLASS_NAME, using = "premiumPlanPrice")
	WebElement insurancePrice;
	
	@FindBy(xpath = "PUT THE XPATH HERE")
	WebElement planName;
	//*[@id="root"]/div/div[2]/section/article[1]/div/div/div/div[2]/div/p[2]
	//*[@id="root"]/div/div[2]/section/article[2]/div/div/div/div[1]/div/p[2]
	//*[@id="root"]/div/div[2]/section/article[3]/div/div/div/div[2]/div/p[2]
	//*[@id="root"]/div/div[2]/section/article[4]/div/div/div/div[1]/div/p[2]
	//*[@id="root"]/div/div[2]/section/article[5]/div/div/div/div[2]/div/p[2]
	
	@FindBy(xpath = "//*[@id=\"17_sort\"]")
	WebElement lowToHighOpt;
	
	
	public void selectSortBy() {
		sortByBtn.click();
		//write it according to dropdown input type
	}
	
	public void selectingOption() {
		lowToHighOpt.click();
		//write it according to checkbox input type
	}
	
	public void insuranceProviderList() {
		List<String> providerList = insuranceProvider.getText();
		//error in above code - correct it
	}
	
	public void insurancePriceList() {
		List<String> priceList = insurancePrice.getText();
		//error in above code - correct it
	}
	
	public void insuranceNameList() {
		List<String> nameList = planName.getText();
		//error in above code - correct it
	}

}
