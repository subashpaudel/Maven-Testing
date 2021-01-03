package com.subash.testing;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestLogin {
	
public static WebDriver driver = null;
	
   /* @Parameters({"browserName"})*/  
	@Test	
	public void register() throws InterruptedException {
		
		 /*System.setProperty("webdriver.gecko.driver",".\\drivers\\geckodriver.exe");
		   driver = new FirefoxDriver();   */
		 System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		   
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
			
			Thread.sleep(5000);
			driver.findElement(By.xpath(" //img[@src='/business/images/default-user.png']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
			Thread.sleep(5000);
			driver.close();
		  }
    	
    	
		/*if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		
		driver.get("https://freecrm.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[@id='ui']/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("sub.paudel@gmail.com");
		driver.findElement(By.xpath("//body/div[@id='ui']/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("Ratnamaya1@");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//body/div[@id='ui']/div[1]/div[1]/form[1]/div[1]/div[3]")).click();
		Thread.sleep(2000);
		WebElement name = driver.findElement(By.xpath("//span[contains(text(),'Subash Paudel')]"));
		String actual = name.getText();
		System.out.println(actual);
		Thread.sleep(5000);
		
		System.out.println("Browser name is : "+browserName);
		
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver",".\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://freecrm.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String title = driver.getTitle();
		System.out.println(title);*/
		
	}
	/*
	@Test
	@Parameters({"browserName"}) 
	public void login(String browserName) throws InterruptedException {
		
		if (browserName.equalsIgnoreCase("firefox")) {
		
		System.setProperty("webdriver.gecko.driver",".\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		}
		
		driver.get("https://freecrm.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		driver.findElement(By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[@id='ui']/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("sub.paudel@gmail.com");
		driver.findElement(By.xpath("//body/div[@id='ui']/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("Ratnamaya1@");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//body/div[@id='ui']/div[1]/div[1]/form[1]/div[1]/div[3]")).click();
		Thread.sleep(2000);
		WebElement name = driver.findElement(By.xpath("//span[contains(text(),'Subash Paudel')]"));
		String actual = name.getText();
		System.out.println(actual);
		Thread.sleep(5000);
		
		
		
		
			
		}*/
	
	/*@Test(priority=2)
	public void contact() throws InterruptedException {
		WebElement contact =driver.findElement(By.linkText("Contacts"));
		contact.click();
		System.out.println(contact.getText());
		//driver.findElement(By.xpath("//a[@href=\"/contacts/new\"]/button")).click();
		
		
		driver.findElement(By.xpath("//header/div[1]/nav[1]/div[2]/div[1]/div[2]/ul[1]/a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[@id='ui']/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("sub.paudel@gmail.com");
		driver.findElement(By.xpath("//body/div[@id='ui']/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("Ratnamaya1@");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//body/div[@id='ui']/div[1]/div[1]/form[1]/div[1]/div[3]")).click();
		Thread.sleep(2000);
		WebElement name = driver.findElement(By.xpath("//span[contains(text(),'Subash Paudel')]"));
		String actual = name.getText();
		System.out.println(actual);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//body/div[@id='ui']/div[1]/div[1]/a[3]")).click();
		driver.findElement(By.xpath("//a[@href=\"/contacts/new\"]/button")).click();
		
		
		
	}*/
/*	@AfterMethod
		public void finish() {
		driver.close();
	}*/


