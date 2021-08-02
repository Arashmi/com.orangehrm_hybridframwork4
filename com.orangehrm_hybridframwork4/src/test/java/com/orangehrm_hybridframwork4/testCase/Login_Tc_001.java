package com.orangehrm_hybridframwork4.testCase;

import org.testng.annotations.Test;

import com.orangehrm_hybridframwork4.pageObject.LoginPage;
import com.orangehrm_hybridframwork4.testBase.TestBase;

public class Login_Tc_001 extends TestBase{
	
	@Test
	public void loginOrangeHrmTest() {
		
		
		LoginPage login =new LoginPage(driver);
		login.loginOrangeHrm();
	}
	

}
