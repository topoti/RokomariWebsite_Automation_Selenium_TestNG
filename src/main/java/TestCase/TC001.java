package TestCase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.DriverSetUp;

public class TC001 extends DriverSetUp {
String baseUrl="https://www.rokomari.com/book";
	
	@Test
	public void locatorLearning() throws InterruptedException {
		driver.get(baseUrl);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@Test
		public void verifyTitle()
		   {
			   String actualTitle=driver.getTitle();

				String expectedTitle="Buy Book Online - Best Online Book Shop in Bangladesh | Rokomari.com";

				Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test
	public void verifyLogo()

	{

	boolean flag=driver.findElement(By.xpath("/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")).isDisplayed();

	Assert.assertTrue(flag);

	}

}
