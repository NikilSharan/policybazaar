package testCase;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.TravelInsPlanPage1_6;
import testBase.BaseClass;

public class TC_016_Travel_PlansPage extends BaseClass {
	
	@Test
	public void Logo_Displayed() throws InterruptedException {
		TravelInsPlanPage1_6 tip = new TravelInsPlanPage1_6(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//try {
			//Thread.sleep(5000);
			//Thread.sleep(5000);
			
			logger.info("***TC_016 STARTS***");
			Thread.sleep(5000);
			//Thread.sleep(5000);
			
			tip.alertHandle();
			Thread.sleep(5000);
			
			tip.popupHandle();
			Thread.sleep(5000);
			tip.selectSortBy();
			Thread.sleep(5000);
			tip.selectingOption();
			Thread.sleep(5000);
			tip.Plan_details();
			
			//Assert.assertTrue(true);
			logger.info("***TC_016 Passed***");

		//}
		/*catch (Exception e) {
			logger.error("***TC_016 failed***");
			Assert.fail();

		}*/
	}
}
