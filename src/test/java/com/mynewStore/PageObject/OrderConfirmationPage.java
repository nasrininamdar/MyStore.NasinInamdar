package com.mynewStore.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmationPage {
	
	
	

	//1.create object of WebDriver
	WebDriver ldriver;
	
	public OrderConfirmationPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);  //Search context ,object page
	}
	
	//2.identify WebElements
	//
	@FindBy(xpath="//button[@class='button btn btn-default button-medium']") private WebElement confirmOrder;
	@FindBy(xpath="//a[@title='Log me out']") private WebElement sign_out;
	@FindBy(xpath="//p[@class='alert alert-success']") private WebElement successAlert;
	
	//3.identity action on Webelement
	
	
	public void clickOnConfirmorder() {
		confirmOrder.click();
	}
	public void clickOnSignOut() {
		sign_out.click();
	}
	
	public String getOrderSuccessMassage() {
		return (successAlert.getText());
		
	}
	
	
	
	
}
