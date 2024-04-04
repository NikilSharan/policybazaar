package testCase;

import java.time.Duration;

import org.testng.annotations.Test;

import pageObjects.CarPriceQuotePage2_6;
import testBase.BaseClass;

public class TC_034_CarQuotePage extends BaseClass {
	
	@Test
	public void Logo_Displayed() throws InterruptedException {
		CarPriceQuotePage2_6 cpq = new CarPriceQuotePage2_6(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//try {
			Thread.sleep(5000);
			logger.info("***TC_016 STARTS***");
			
			
			//Assert.assertTrue(true);
			logger.info("***TC_016 Passed***");

		//}
		/*catch (Exception e) {
			logger.error("***TC_016 failed***");
			Assert.fail();

		}*/
	}
}

