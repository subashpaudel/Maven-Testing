package com.subash.testing;



import java.util.List;
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
			
			driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("sanjip.thapa@f1soft.com");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Test@123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
			
			Thread.sleep(5000);
			/*driver.findElement(By.xpath(" //img[@src='/business/images/default-user.png']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
			Thread.sleep(5000);*/
			driver.findElement(By.xpath("//span[normalize-space()='Promotion']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[normalize-space()='Create Promotion']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id='create_promotion_form_title']")).sendKeys("Automation");
			driver.findElement(By.xpath("//input[@id='create_promotion_form_channels_1']")).click();
			
			/*List<WebElement> list = driver.findElements(By.xpath("//span[normalize-space()='Select Message Template']")).click();*/
			/*System.out.println(list.size());*/
			driver.findElement(By.xpath("//span[normalize-space()='Select Message Template']")).click();
			
			Thread.sleep(2000);
			List<WebElement> list = driver.findElements(By.xpath("//ul[@class='chosen-results']//li"));
			System.out.println(list.size());
			
			for(int i=0;i<list.size();i++) {
				System.out.println(list.get(i).getText());
				if(list.get(i).getText().contains("This is sms fail over test")) {
					list.get(i).click();
					break;
				}
			}
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@id='create_promotion_form_csvFile']")).sendKeys("C:\\Users\\subpa\\Downloads\\my number.csv");
				Thread.sleep(3000);
			/*driver.findElement(By.xpath("//input[@class='chosen-search-input']")).sendKeys("This is sms fail over test");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//li[normalize-space()='This is sms fail over test']")).click();*/
				driver.findElement(By.xpath("//input[@id='create_promotion_form_deliverBefore']")).click();
				/*driver.findElement(By.xpath("//td[@class='today active start-date active end-date available']")).click();*/
				Thread.sleep(3000);
				driver.findElement(By.xpath("//button[normalize-space()='Apply']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//button[normalize-space()='Create']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//i[@class='fa fa-check-circle-o']")).click();
				Thread.sleep(3000);
				driver.switchTo().alert().accept();
				Thread.sleep(3000);
			
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


