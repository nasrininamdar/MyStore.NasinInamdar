package com.mynewStore.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyaccountPageForAddress {

	WebDriver ldriver;

	public MyaccountPageForAddress(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}
	
	@FindBy(xpath="//a[@title='Add my first address']") private WebElement addMyFirstAddress;
	
	public void clickaddMyFirstAddress() {
		addMyFirstAddress.click();
	}
}
