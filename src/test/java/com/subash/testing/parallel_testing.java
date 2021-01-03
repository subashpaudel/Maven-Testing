package com.subash.testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class parallel_testing {
	
	/*public static WebDriver driver = null;*/
	
	 @Test
	  public void FirefoxTest() throws InterruptedException { 
		 WebDriver driver;
		 System.setProperty("webdriver.gecko.driver",".\\drivers\\geckodriver.exe");
	//Initializing the firefox driver (Gecko)
	 System.out.println("The thread ID for Firefox is "+ Thread.currentThread().getId());
	   driver = new FirefoxDriver();   
	  /* driver.get("https://www.demoqa.com"); 
	   driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
	   driver.quit();
	 System.out.println("Hi this is firefox");*/
	   driver.get("https://uat-viber.f1soft.com/business/auth/login");
		driver.manage().window().maximize();
		/*driver.manage().deleteAllCookies();*/
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("subashf1soft@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Ratnamaya1@");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		
		
		/*driver.findElement(By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[@id='ui']/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("sub.paudel@gmail.com");
		driver.findElement(By.xpath("//body/div[@id='ui']/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("Ratnamaya1@");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//body/div[@id='ui']/div[1]/div[1]/form[1]/div[1]/div[3]")).click();
		Thread.sleep(2000);
		WebElement name = driver.findElement(By.xpath("//span[contains(text(),'Subash Paudel')]"));
		String actual = name.getText();
		System.out.println(actual);*/
		Thread.sleep(5000);
		driver.findElement(By.xpath(" //img[@src='/business/images/default-user.png']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
		Thread.sleep(5000);
		driver.close();
	  }
	 
	 @Test
	 public void ChromeTest() throws InterruptedException
	 { 
		 WebDriver driver;
		/* System.setProperty("webdriver.gecko.driver",".\\drivers\\geckodriver.exe");
			//Initializing the firefox driver (Gecko)
			 System.out.println("The thread ID for Firefox is "+ Thread.currentThread().getId());
			   driver = new FirefoxDriver();   
			   driver.get("https://www.demoqa.com"); 
			   driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
			   driver.quit();*/
	 
		 System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe"); //Initialize the chrome driver
	 System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());
	   driver = new ChromeDriver();
	  /* driver.get("https://www.demoqa.com"); 
	   driver.manage().window().maximize();
	   driver.findElement(By.xpath("//h5[normalize-space()='Elements']")).click();
	   driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
	   driver.quit();
		 
		 System.out.println("Hi this is chrome");*/
		 
		 
		 driver.get("https://uat-viber.f1soft.com/business/auth/login");
			driver.manage().window().maximize();
			/*driver.manage().deleteAllCookies();*/
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(3000);
			
			
			driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("sanjip.thapa@f1soft.com");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Test@123");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
			
			
			/*driver.findElement(By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//body/div[@id='ui']/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("sub.paudel@gmail.com");
			driver.findElement(By.xpath("//body/div[@id='ui']/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("Ratnamaya1@");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//body/div[@id='ui']/div[1]/div[1]/form[1]/div[1]/div[3]")).click();
			Thread.sleep(2000);
			WebElement name = driver.findElement(By.xpath("//span[contains(text(),'Subash Paudel')]"));
			String actual = name.getText();
			System.out.println(actual);*/
			
			Thread.sleep(5000);
			driver.findElement(By.xpath(" //img[@src='/business/images/default-user.png']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
			Thread.sleep(5000);
			driver.close();
	 
	 }

}
