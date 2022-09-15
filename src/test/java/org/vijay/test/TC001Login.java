package org.vijay.test;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.vijay.pages.LoginPage;
import org.vijay.seleniumBase.Base;

public class TC001Login extends Base{
	@BeforeTest
	public void setData() {
		fileName="TC001";
	}
	
	@Test(dataProvider = "data")
	public void loginTest(String[] data) {
		LoginPage lp=new LoginPage(driver);
		boolean unlabel = lp.getUsernameLabel();
		Assert.assertEquals(unlabel, true);
		boolean pwlabel = lp.getPasswordLabel();
		Assert.assertTrue(pwlabel);
		new LoginPage(driver)
		.enterUserName(data[0])
		.enterUserPassword(data[1])
		.clickLogin();
		
		
		
	}

}
