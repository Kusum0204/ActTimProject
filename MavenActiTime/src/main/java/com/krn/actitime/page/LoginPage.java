package com.krn.actitime.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.krn.actitime.baseclass.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(id="username")
	WebElement username;

	@FindBy(name="pwd")
	WebElement password;
	
	@FindBy(id="loginButton")
	WebElement login;
	
	@FindBy(xpath="//div[@class=\"atLogoImg\"]")
	WebElement logo;
	
	@FindBy(xpath="//div[@class=\"atProductName\"]")
	WebElement logoText;
	
	@FindBy(xpath="//a[contains(text(),'Forgot your password')]")
	WebElement forgotPassword;
	
	@FindBy(id="headerContainer")
	WebElement headerText;
	
	@FindBy(id="keepLoggedInCheckBox")
	WebElement keepLogedChkBx;
	
	//page object intialisation
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginpageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateActitimeLogo() {
		return logo.isDisplayed();
	}
	
	public boolean validateForgotPassword() {
		return forgotPassword.isDisplayed();
	}
	
	public boolean validateActitimeName() {
		return headerText.isDisplayed();
	}

	public boolean validateKeepLogedInChk() {
		return keepLogedChkBx.isSelected();
	}
	
	public HomePage login(String un, String pass ) {
		username.sendKeys(un);
		password.sendKeys(pass);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", login);
		return new HomePage();
	}
}
