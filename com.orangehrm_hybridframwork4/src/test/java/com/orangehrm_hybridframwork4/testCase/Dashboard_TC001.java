package com.orangehrm_hybridframwork4.testCase;

import org.testng.annotations.Test;

import com.orangehrm_hybridframwork4.pageObject.DashboardPage;
import com.orangehrm_hybridframwork4.pageObject.LoginPage1;
import com.orangehrm_hybridframwork4.testBase.TestBase1;

public class Dashboard_TC001 extends TestBase1{
	
	@Test
	public void logoutTC_001() {
		LoginPage1 lp=new LoginPage1(driver);
		lp.setUsername("Admin");
		lp.setPassword("admin123");
		
		DashboardPage dp=lp.clickOnLoginBtn();
		dp.clickOnLogoutLink();
	}

}
