package com.orangehrm_hybridframwork4.testCase;

import org.testng.annotations.Test;


import com.orangehrm_hybridframwork4.pageObject.LoginPage1;
import com.orangehrm_hybridframwork4.testBase.TestBase1;

public class Login_TC002 extends TestBase1 {
	
	@Test
	public void login_TC002() {
		
		LoginPage1 login=new LoginPage1(driver);
		String uname=excelDataProvider.getStringCellData("login", 0, 1);
		String upass=excelDataProvider.getStringCellData("login", 0, 1);
		login.setUsername(uname);
		login.setPassword(upass);
		login.clickOnLoginBtn();
	}
	

}
