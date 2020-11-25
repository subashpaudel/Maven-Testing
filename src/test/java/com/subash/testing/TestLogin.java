package com.subash.testing;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLogin {
	
public static WebDriver driver = null;
	
	
	@BeforeMethod
	
	public void register() {
		
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://freecrm.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String title = driver.getTitle();
		System.out.println(title);
		
	}
	
	@Test(priority=1)
	public void login() throws InterruptedException {
		
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
		
		
		
		
			
		}
	
	@Test(priority=2)
	public void contact() throws InterruptedException {
		/*WebElement contact =driver.findElement(By.linkText("Contacts"));
		contact.click();
		System.out.println(contact.getText());*/
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
		
		
		
	}
	@AfterMethod
		public void finish() {
	}

}
