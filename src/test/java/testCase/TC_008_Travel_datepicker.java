package testCase;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.TripDate1_2;
import testBase.BaseClass;

public class TC_008_Travel_datepicker extends BaseClass {
	
	@Test
	public void Logo_Displayed() throws InterruptedException {
		TripDate1_2 tp = new TripDate1_2(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		try {
			logger.info("******");
			Thread.sleep(3000);
			
			tp.clickingStartDateField();
			
			tp.selectingStartDate();
			
			tp.clickingEndDateField();
			
			tp.selectingEndDate();
			
			tp.clickingBtn2();
	
			Assert.assertTrue(true);
			logger.info("***TC_002 Passed***");

		}
		catch (Exception e) {
			logger.error("***TC_002 failed***");
			Assert.fail();

		}
	}
}