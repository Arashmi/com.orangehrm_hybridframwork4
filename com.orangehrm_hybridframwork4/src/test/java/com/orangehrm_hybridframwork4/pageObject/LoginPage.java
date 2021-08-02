package com.orangehrm_hybridframwork4.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
     
	//WebElement repository at page Level
	
	@FindBy(name="txtUsername")
	WebElement username;
	
	@FindBy(name="txtPassword")
	WebElement userpassword;
	
	@FindBy(id="btnLogin")
	WebElement loginBtn;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void loginOrangeHrm() {
		
		username.sendKeys("Admin");
		userpassword.sendKeys("admin123");
		
		
		loginBtn.click();
		
	}
}
	
		
	

