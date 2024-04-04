package pageObjects;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TravelInsPlanPage1_6 extends basePage {

	public TravelInsPlanPage1_6(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/aside/section[1]/details/summary/p")
	WebElement sortByBtn;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/section")
	List<WebElement> planName;
	
	@FindBy(how = How.CLASS_NAME, using = "quotesCard--insurerName")
	List<WebElement> insuranceProvider;
	
	@FindBy(how = How.CLASS_NAME, using = "premiumPlanPrice")
	List<WebElement> insurancePrice;
	
	@FindBy(xpath = "//*[@id=\"17_sort\"]")
	WebElement lowToHighOpt;
	
	@FindBy(xpath = "//*[@id=\"modal-root\"]/div/div/span")
	WebElement popupClose;
	
//	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/section/article")
//	List<WebElement> totalPlans;
	
//	//*[@id="root"]/div/div[2]/section/article[1]/div/div/div/div[2]/div/p[2]
//	//*[@id="root"]/div/div[2]/section/article[2]/div/div/div/div[1]/div/p[2]
//	//*[@id="root"]/div/div[2]/section/article[3]/div/div/div/div[2]/div/p[2]
//	//*[@id="root"]/div/div[2]/section/article[4]/div/div/div/div[1]/div/p[2]
//	//*[@id="root"]/div/div[2]/section/article[5]/div/div/div/div[2]/div/p[2]
	
	
	public void selectSortBy() {
		sortByBtn.click();
		//write it according to dropdown input type
	}
	
	public void selectingOption() {
		lowToHighOpt.click();
		//write it according to checkbox input type
	}
	
	public void alertHandle() {
		Alert alert = driver.switchTo().alert();
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		alert = mywait.until(ExpectedConditions.alertIsPresent());
		alert.dismiss();
		
		//write it according to dropdown input type
	}
	
	public void popupHandle() {
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		mywait.until(ExpectedConditions.visibilityOfElementLocated((By) popupClose));
		
		popupClose.click();
		
	}
	
	public void Plan_details() {
		List<String> PlansNameList = new ArrayList<String>();
		List<String> PriceList = new ArrayList<String>();
		List<String> ProviderList = new ArrayList<String>();
		
		for(int i = 0; i < 3; i++) {
			PlansNameList.add(planName.get(i).getText());
			ProviderList.add(insuranceProvider.get(i).getText());
			PriceList.add(insurancePrice.get(i).getText());
			
			//System.out.println(ProviderList.add(insuranceProvider.get(i) + "			" + PlansNameList.add(planName.get(i) + "		" + PriceList.add(insurancePrice.get(i)));
			System.out.println(PlansNameList.get(i));
		}
	}
	
	//POPUP XPATH = //*[@id="modal-root"]/div/div/span
	
	
	
	
	
	
	

}
