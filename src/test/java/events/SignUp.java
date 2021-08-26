package events;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import setup.ParentDriver;

public class SignUp extends ParentDriver{
	WebDriver driver = getDriver();
	
	@Test (priority =1)
	public void clickCreateAccount() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(.,'Create Account!')]")).click();
		Thread.sleep(1000);
		
	}
	
	@Test (priority =2)
	public void enterEmailAddress() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id=\"reg-email\"]")).sendKeys("hridoydas@yopmail.com");
		Thread.sleep(1000);
	}
	@Test (priority =3)
	public void enterPassword() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id=\"reg-password\"]")).sendKeys("Test@@00");
		Thread.sleep(1000);
	}
	
	@Test (priority =4)
	public void selectCountry() throws InterruptedException {
		driver.findElement(By.xpath("//button[@data-id='reg-country']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("Bangladesh");
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[contains(.,'Bangladesh')]")).click();
		Thread.sleep(2000);
	}
	
	@Test (priority =5)
	public void clickCheckbox() throws InterruptedException {
		driver.findElement(By.xpath("//input[@xpath=1]")).click();	
		
		Thread.sleep(1000);
	}
	
	@Test (priority =6)
	public void clickCreateButton() throws InterruptedException {
		driver.findElement(By.xpath("//button[contains(.,'Create Account')]")).click();
		Thread.sleep(1000);
	}
	

}
