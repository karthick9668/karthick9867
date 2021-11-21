package org.frame;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Adactinjunit {
	
	static WebDriver driver;
	
	@BeforeClass
	public static void beforeclass() {
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	
	}
	@AfterClass
	public static void afterclass() {
		driver.quit();
		
	}
	@Before
	public void before() {
		Date date = new Date();
		System.out.println(date);

	}
	
	@After
	public void after() {
		Date date = new Date();
		System.out.println(date);

	}
	@Test
	public void test1() {

		
		WebElement findElement = driver.findElement(By.id("username"));
		findElement.sendKeys("karthick123456789");
		
		WebElement findElement2 = driver.findElement(By.id("password"));
		findElement.sendKeys("karthick123456789");
		
		WebElement findElement3 = driver.findElement(By.id("login"));
		findElement.click();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
