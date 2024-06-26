package testCase;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Destination1_1;
import testBase.BaseClass;

public class TC_006_TravelInsurance extends BaseClass {
	
	@Test
	public void Logo_Displayed() throws InterruptedException {
		Destination1_1 dn = new Destination1_1(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		try {
			logger.info("******");
			Thread.sleep(3000);
			boolean result = dn.Is_inputfieldActive();
			Assert.assertEquals(result, true);
			
			logger.info("***TC_002 Passed***");

		}
		catch (Exception e) {
			logger.error("***TC_002 failed***");
			Assert.fail();

		}
	}
}
