package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Travellers1_3 extends basePage {

	public Travellers1_3(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//*[@id=\"traveller_2\"]")
	WebElement noOfPersons;
	
	@FindBy(xpath = "//*[@id=\"0\"]")
	WebElement person1age;
	
	@FindBy(xpath = "//*[@id=\"1\"]")
	WebElement person2age;
	
	@FindBy(xpath = "//*[@id=\"prequote-wrapper\"]/div[2]/div/div[2]/button")
	WebElement nextBtn;
	
	
	public void selectingNoOfPersons() {
		noOfPersons.click();
	}
	
	public void selectingPersonAge1() {
		person1age.click();
		//use SELECT to select the option
		//xpath for age 21 - //*[@id="21 years_undefined"]
	}
	
	public void selectingPersonAge2() {
		person2age.click();
		//use SELECT to select the option
		//xpath for age 22 - //*[@id="22 years_undefined"];
	}
	
	public void clickingBtn3() {
		nextBtn.click();
	}
	
	
}
