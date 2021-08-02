package com.orangehrm_hybridframwork4.testBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class TestBase {
	
  public static WebDriver driver=null;
   
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","E:\\Selinium\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
