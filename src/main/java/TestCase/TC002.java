package TestCase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.DriverSetUp;

public class TC002 extends DriverSetUp {
String baseUrl="https://www.rokomari.com/book";
	
	@Test
	public void locatorLearning() throws InterruptedException {
		driver.get(baseUrl);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	//Verify SignUp
	@Test
		public void signUp() throws InterruptedException
		{
		driver.findElement(By.xpath("/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/section[1]/div[2]/div[1]/p[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("nm")).sendKeys("Topoti Sarkar");
		Thread.sleep(1000);
		driver.findElement(By.id("js-email")).sendKeys("ts03351@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("js-phone")).sendKeys("01749519076");
		Thread.sleep(1000);
		driver.findElement(By.id("pwd")).sendKeys("Test@1234");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/section[1]/div[2]/div[3]/form[1]/div[6]/div[1]/div[1]/div[1]/div[1]/iframe[1]")).click();
		 Thread.sleep(15000);
		 driver.findElement(By.xpath("//button[contains(text(),'Create Account')]")).click();
		 Thread.sleep(10000);
		}
}
