package testCase;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_006_TravelInsurance extends BaseClass {
	
	@Test
	public void Logo_Displayed() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		try {
			logger.info("******");
			Thread.sleep(3000);
			boolean result = hp.IsLogo_Displayed();
			Assert.assertEquals(result, true);
			logger.info("***TC_002 Passed***");

		}
		catch (Exception e) {
			logger.error("***TC_002 failed***");
			Assert.fail();

		}
	}
}
