package com.mynewStore.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPaymentPage {

	

	//1.create object of WebDriver
			WebDriver ldriver;
			
			public OrderPaymentPage(WebDriver rdriver) {
				ldriver = rdriver;
				PageFactory.initElements(rdriver, this);  //Search context ,object page
			}
			
			//2.identify WebElements
			
			@FindBy(xpath="//a[@class='bankwire']") private WebElement payByCheck;
			@FindBy(xpath="//a[@class='cheque']") private WebElement payByBankWire;
			
			//3.identity action on Webelement
			
			public void clickOnPayByCheck() {
				payByCheck.click();
			}
			public void clickOnpayByBankWire() {
				payByBankWire.click();
			}
			
			
	
}
