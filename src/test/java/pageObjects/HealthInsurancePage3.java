package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HealthInsurancePage3 extends basePage {
	
	WebDriver driver;
	
	public HealthInsurancePage3(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "/html/body/div[5]/div[2]/div/ul/li[2]/div/div/div[3]/h3/a")
	WebElement healthInsuranceTxt; 
	
	@FindBy(xpath = "/html/body/div[5]/div[2]/div/ul/li[2]/div/div/div[3]/ul/li["r"]/a/span") // change r value to get all list items
	List<WebElement> planNameList; 

	@FindBy(xpath = "/html/body/div[5]/div[2]/div/ul/li[2]/a")
	WebElement InsuranceProducts;
	
	
	public void getting_title() {
		String planTitle = healthInsuranceTxt.getText();
	}
	
	public void get_healthPlansList() {
		//try using LinkedText locator to get the text
		List<WebElement> plans = planNameList;
		List<String> healthPlansList = new ArrayList<String>();
		for(int i = 0; i < plans.size(); i++) {
			healthPlansList.add(plans.get(i).getText());
		}
		
		//fix the error
	}
	
	public void hover_products() {
		Actions act = new Actions(driver);
		act.moveToElement(InsuranceProducts).click().perform();
	}



}
