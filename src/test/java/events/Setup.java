package events;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import setup.ParentDriver;

public class Setup extends ParentDriver{

WebDriver driver = getDriver();
	
	@BeforeTest 
	public void openURL () throws InterruptedException {
		driver.get("https://my.staging.walletory.net/account/login");
		System.out.println("======AUTOMATION START=======");
		Thread.sleep(2000);
	}
	@AfterTest 
	public void tearDown() throws InterruptedException {
		Thread.sleep(1000);
		driver.quit();
		System.out.println("======AUTOMATION END======");
	}
}
