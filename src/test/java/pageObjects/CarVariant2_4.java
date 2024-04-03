package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarVariant2_4 extends basePage{

	public CarVariant2_4(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//*[@id=\"variantScroll\"]/li["+r+"]/span/b") // r value varies
	public List<WebElement> variant;
	

	
	public void selectingCarVariant(WebElement user_variant_choice) {
		List<WebElement> variantList = new ArrayList<WebElement>();
		variantList = variant;
	// List<String> variantList = driver.findElements((By) variant).getText();
		for(int i = 0; i < variantList.size(); i++) {
			if(variantList.get(i).equals(variantList)) {
				variantList.get(i).click();
			}
		}
		
	}

}