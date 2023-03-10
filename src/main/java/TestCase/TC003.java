package TestCase;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.DriverSetUp;

public class TC003 extends DriverSetUp{
String baseUrl="https://www.rokomari.com/book";
	
	@Test(priority = 0 )
	public void locatorLearning() throws InterruptedException {
		driver.get(baseUrl);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	//Verify Login
	@Test(priority = 1 )
	public void login() throws InterruptedException
	{
		driver.findElement(By.xpath("/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/section[1]/div[2]/div[1]/p[1]")).click();
		//Thread.sleep(2000);
		driver.findElement(By.id("j_username")).sendKeys("ts03351@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("j_password")).sendKeys("Test@1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/section[1]/div[2]/div[2]/form[1]/button[1]")).click();
		Thread.sleep(2000);
	}
	
	@Test(priority = 2)
	public void Order() throws InterruptedException
	{
	Actions action=new Actions(driver);
	WebElement element=driver.findElement(By.linkText("লেখক"));
	action.moveToElement(element).build().perform();
	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'হুমায়ূন আহমেদ')]")));
	
	WebElement element2=driver.findElement(By.xpath("//a[contains(text(),'হুমায়ূন আহমেদ')]"));
	action.moveToElement(element2);
	action.click().build().perform();
	Thread.sleep(2000);
	
	}
	
		@Test(priority = 3 )
		public void addToCart() throws InterruptedException
	      {
	       
			
			driver.get("https://www.rokomari.com/book/1323/ebong-himu");
			
			driver.findElement(By.xpath("//a[contains(text(),'একটু পড়ে দেখুন')]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//body/div[5]/div[1]/div[1]/i[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//body/div[5]/section[1]/section[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/a[2]")).click();
			Thread.sleep(2000);
			
		
	      }

	      @Test(priority = 4 )
	      public void viewCart() throws InterruptedException
	      {
	          List<WebElement> clickOnCart = driver.findElements(By.className("cart-menu"));
	          clickOnCart.get(0).sendKeys(Keys.ENTER);
	          
	          Thread.sleep(2000);
	      }

	    @Test(priority = 5 )
	    public void placeOrder() throws InterruptedException
	    {
	    	 driver.findElement(By.xpath("//a[@id='js-continue-to-shipping']")).click();
	          Thread.sleep(2000);
	          WebElement dropdown = driver.findElement(By.id("js--city"));
	          Select selectCity = new Select(dropdown);
	          selectCity.selectByVisibleText("টাঙ্গাইল");
	          Thread.sleep(2000);
	          WebElement dropdown2 = driver.findElement(By.id("js--area"));
	          Select selectArea = new Select(dropdown2);
	          selectArea.selectByVisibleText("টাঙ্গাইল সদর ");
	          Thread.sleep(2000);
	          WebElement dropdown3 = driver.findElement(By.id("js--zone"));
	          Select selectZone = new Select(dropdown3);
	          selectZone.selectByVisibleText("টাঙ্গাইল পৌরসভা");
	          Thread.sleep(2000);
	          driver.findElement(By.id("address")).sendKeys("Mawlana Bhashani Science and Technology University, Santosh");
	          Thread.sleep(2000);
	          driver.findElement(By.xpath("//body/div[@id='shipping-payment']/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]")).click();
	          Thread.sleep(2000);
	          
	    }
		
}
