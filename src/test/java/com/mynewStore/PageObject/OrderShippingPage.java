package com.mynewStore.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderShippingPage {
	
	

	//1.create object of WebDriver
			WebDriver ldriver;
			
			public OrderShippingPage(WebDriver rdriver) {
				ldriver = rdriver;
				PageFactory.initElements(rdriver, this);  //Search context ,object page
			}
			
			//2.identify WebElements
			
			@FindBy(xpath="//input[@id='cgv']") private WebElement termsOfServices;
			@FindBy(xpath="//button[@name='processCarrier']") private WebElement proceedShipping;
			//3.identity action on Webelement
			
			public void selectTermsService() {
				termsOfServices.click();
			}
			public void clickOnProceedToCheckout() {
				proceedShipping.click();
			}

			

}
