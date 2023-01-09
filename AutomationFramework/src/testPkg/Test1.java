package testPkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 
{
	WebDriver driver;
	
	@Test
	public void runPage() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver");
		
		driver = new ChromeDriver(); //open browser
		driver.manage().window().maximize();
		driver.get("https://www.universalorlando.com/web/en/us");
		System.out.println("Browser Successfully Launched");
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		
		 
		driver.findElement(By.cssSelector("[aria-label='Menu']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sign In")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[type='email']")).sendKeys("email@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("password");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[type='submit']")).click(); 
		
	}
	
	
	
	
	
}
