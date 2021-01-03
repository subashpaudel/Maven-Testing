package com.subash.testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Registration {
	public static WebDriver driver = null;
	
	
	@BeforeClass
	
	public void register() {
		
		//System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver",".\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://freecrm.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String title = driver.getTitle();
		System.out.println(title);
		
	}
	
	/*@Test
	
	public void registration() throws InterruptedException {
		
		driver.findElement(By.xpath("//body/div[1]/main[1]/section[1]/a[1]")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("subash.paudel544025@gmail.com");
		driver.findElement(By.xpath("//input[@id='phone_number']")).sendKeys("9867756052");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='terms']")).click();
		Thread.sleep(2000);
		WebElement iframe=driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[2]/form[1]/div[5]/center[1]/div[1]/div[1]/div[1]/iframe[1]"));
		driver.switchTo().frame(iframe);
		WebElement iFrame_checkbox = driver.findElement(By.id("recaptcha-anchor"));
		iFrame_checkbox.click();
		Thread.sleep(2000);
		WebElement iFrame=driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[2]/form[1]/div[5]/center[1]/div[1]/iframe[1]"));
		driver.switchTo().frame(iFrame);
		WebElement button =
		driver.findElement(By.tagName("button"));
		button.click();
		
		
		
		driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();
		Thread.sleep(2000);
		
		
		
		
		
	}*/
	
	@AfterClass
	
	public void finish() {
		
		
	}

}
