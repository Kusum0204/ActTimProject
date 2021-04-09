package com.krn.actitime.testcases;




import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.krn.actitime.baseclass.TestBase;
import com.krn.actitime.page.HomePage;
import com.krn.actitime.page.LoginPage;

public class LoginPageTest extends TestBase{
 
	LoginPage loginpage;
	HomePage homepage;
	
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginpage=new LoginPage();
		}
	
	@Test(priority = 1)
	public void loginPageTitleTest() {
		String title=loginpage.validateLoginpageTitle();
		String etitle="actiTIME - Login";
		Assert.assertEquals(title, etitle);
		}

	@Test(priority = 2)
	public void logPageLogoTest() {
		boolean flag=loginpage.validateActitimeLogo();
		Assert.assertTrue(flag);
		}
	@Test(priority = 3)
	public void loginTest() {
		homepage=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
}
