package pageObjects;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HealthInsurancePage3 extends basePage {
	
	public WebDriver driver;
	
	public HealthInsurancePage3(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "/html/body/div[5]/div[2]/div/ul/li[2]/div/div/div[3]/h3/a")
	
	public WebElement healthInsuranceTxt; 
	
	@FindBy(xpath = "/html/body/div[5]/div[2]/div/ul/li[2]/div/div/div[3]/ul") // change i value to get all list items
	public List<WebElement> planNameList; 

	@FindBy(xpath = "/html/body/div[5]/div[2]/div/ul/li[2]/a")
	public WebElement InsuranceProducts;
	
	
	public String getting_title() {
		String planTitle = healthInsuranceTxt.getText();
		return planTitle;
	}
	
	public List<String> get_healthPlansList() {
		//try using LinkedText locator to get the text
		List<String> healthPlansList = new ArrayList<String>();
		for(int i = 1; i <= planNameList.size(); i++) {
			WebElement plans = planNameList.get(i).findElement(By.xpath("/li["+i+"]/a/span"));
			String CityName = plans.getText();
			healthPlansList.add(CityName);
		}
		return healthPlansList;
	}
	
	
	public void hover_products() throws InterruptedException {
		
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		mywait.until(ExpectedConditions.visibilityOfElementLocated((By) InsuranceProducts));
		Actions act = new Actions(driver);
		act.moveToElement(InsuranceProducts).perform();
	}



}
