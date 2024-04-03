package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TripDate1_2 extends basePage {

	public TripDate1_2(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath = "//*[@id=\"prequote-wrapper\"]/div[2]/div/div[1]/div/div[1]/div/div/input")
	WebElement startDateField;
	
	@FindBy(xpath = "//*[@id=\"prequote-wrapper\"]/div[2]/div/div[1]/div/div[2]/div/div/input")
	WebElement endDateField;
	
	@FindBy(how = How.CLASS_NAME, using = "MuiPickersDay-today")
	WebElement startingDate;
	
	@FindBy(xpath = "//*[@id=\"prequote-wrapper\"]/div[2]/div/div[2]/button")
	WebElement nextBtn;
	
	
	public void clickingStartDateField() {
		startDateField.click();
	}
	
	public void clickingEndDateField() {
		endDateField.click();
	}
	
	public void selectingStartDate() {
		//add date selector method to select the dates
	}
	
	public void selectingEndDate() {
		//add date selector method to select the dates
	}
	
	public void clickingBtn2 () {
		nextBtn.click();
	}
	
	

}
