package events;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import setup.ParentDriver;

public class Login extends ParentDriver{

	WebDriver driver = getDriver();
	@Test (priority=1)
	public void enterLoginEmail() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='login-email']")).sendKeys("hridoydas@yopmail.com");
		Thread.sleep(1000);
	}
	
	@Test (priority=2)
	public void enterLoginPassword() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='login-pass']")).sendKeys("Test@@00");
		Thread.sleep(1000);
	}
	
	@Test (priority=3)
	public void clickLoginButton() throws InterruptedException {
		driver.findElement(By.xpath("//button[contains(.,'Login')]")).click();
		Thread.sleep(2000);
	}
}
