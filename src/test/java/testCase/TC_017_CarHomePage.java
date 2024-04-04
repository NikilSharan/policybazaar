package testCase;

import java.time.Duration;


import org.testng.annotations.Test;

import pageObjects.CarInsurancePage2;

import testBase.BaseClass;

public class TC_017_CarHomePage extends BaseClass {
	
	@Test
	public void CarHome() throws InterruptedException {
		CarInsurancePage2 cip = new CarInsurancePage2(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			logger.info("******");
			Thread.sleep(3000);
			cip.clickingBtn();
			
			logger.info("***TC_002 Passed***");

	}
}