package testCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocationSearchTest {
	public static void main(String args[] ){
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		driver.manage().window().maximize();
	}
	

}
