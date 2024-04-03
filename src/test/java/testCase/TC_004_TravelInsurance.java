package testCase;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HealthInsurancePage3;
import testBase.BaseClass;

public class TC_004_TravelInsurance extends BaseClass {
	
	@Test
	public void health_insurance() throws InterruptedException {
		HealthInsurancePage3 hip = new HealthInsurancePage3(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		boolean flag;
		try {
			logger.info("******");
			Thread.sleep(3000);
			System.out.println("start");
			hip.hover_products();
			System.out.println("end");
			logger.info("******");
			System.out.println(hip.getting_title());
			logger.info("******");
			System.out.println(hip.get_healthPlansList());
			flag = true;
		}
		catch (Exception e) {
			logger.error("***Test case AssociateDetails failed***");
			flag = false;
		}
		
		Assert.assertEquals(flag,true);
		System.out.println("Test case ran successfully");
	}
}
