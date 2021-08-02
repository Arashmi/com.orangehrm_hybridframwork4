package com.orangehrm_hybridframwork4.testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangehrm_hybridframwork4.pageObject.DashboardPage;
import com.orangehrm_hybridframwork4.pageObject.LoginPage1;
import com.orangehrm_hybridframwork4.testBase.TestBase1;

public class Login_TC01 extends TestBase1 {
	
	@Test
	
	public void loginTC_001() {
		try {
			LoginPage1 lp=new LoginPage1(driver);
			lp.setUsername("Admin");
			lp.setPassword("admin123");
			DashboardPage dp=lp.clickOnLoginBtn();
		}catch(Exception e) {
			
		}
		
	}

	@Test
	public void loginTC_002() {
		try {
			LoginPage1 lp= new LoginPage1(driver);
			lp.setUsername("Admin#");
			lp.setPassword("admin123");
			lp.clickOnLoginBtn();
			if(driver.getPageSource().contains("Dashboard")) {
				Assert.assertTrue(true);
			}else {
				Assert.assertTrue(false,"Login failed");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

