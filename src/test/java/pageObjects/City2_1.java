package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class City2_1 extends basePage {
	//int r = 0;

	public City2_1(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//*[@id=\"spn1\"]") //spn2; spn3... it keep changing for diff list items; change the code accordingly to dynamic xpath
	
	
	// /html/body/div[1]/div/div[2]/div/div/div/div[2]/div/div[2]/div/div/div/div/ul/li["a"]/span["b"]
	//Above is full xpath
	//a changes from 1 - 5
	//b changes from 1 & 2
	//try writing loop according and get the text
	
	List<WebElement> cityName;
	
	@FindBy(xpath = "//*[@id='c']/ul") // r value varies it get the list elements text
	List <WebElement> RTO;
	
	
	
	
	public void selectingCity(String user_city) {
		List<WebElement> CityList = new ArrayList<WebElement>();;
		for(int i = 1; i <= RTO.size(); i++) {
			WebElement dynamicRTO = RTO.findElement(By.xpath("/li["+i+"]/span")).getText();
			String CityName = dynamicRTO.getText();
			CityList.add(dynamicRTO);
		}
		
		//check if it is working
		
		//randomly select on city from the list and then click it
		
		for(int i = 0; i < CityList.size(); i++) {
			if(CityList.get(i).getText() == user_city) {
				WebElement city = CityList.get(i);
				city.click();
			}
		}
	}
	
	public void selectingRTO(String user_RTO) {
		List<WebElement> RTOList = RTO; 
		//check if it is working
		
		//randomly select on city from the list and then click it
		
		for(int i = 0; i < RTOList.size(); i++) {
			if(RTOList.get(i).getText() == user_RTO) {
				WebElement rto = RTOList.get(i);
				rto.click();
			}
		}
	}
	
	

}
