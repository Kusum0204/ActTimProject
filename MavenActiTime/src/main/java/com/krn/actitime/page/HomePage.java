package com.krn.actitime.page;

import org.openqa.selenium.support.PageFactory;

import com.krn.actitime.baseclass.TestBase;

public class HomePage extends TestBase {
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

}
