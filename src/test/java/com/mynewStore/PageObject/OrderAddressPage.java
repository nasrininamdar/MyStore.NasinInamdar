package com.mynewStore.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderAddressPage {

	
	//1.create object of WebDriver
			WebDriver ldriver;
			
			public OrderAddressPage(WebDriver rdriver) {
				ldriver = rdriver;
				PageFactory.initElements(rdriver, this);  //Search context ,object page
			}
			
			//2.identify WebElements
			
			@FindBy(xpath="//button[@name='processAddress']") private WebElement proceedfromAddressPage;
			
			//3.identity action on Webelement
			
			public void clickOnProceedToCheckout() {
				proceedfromAddressPage.click();
			}

}
