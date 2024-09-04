package com.mynewStore.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage {
	
	//1.create object of WebDriver
	WebDriver ldriver;
	
	public IndexPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);  //Search context ,object page
	}
	
	//2.identify WebElements
	
	@FindBy(xpath="(//a[@rel='nofollow'])[1]") private WebElement Sign_in;
	@FindBy(xpath="(//a[@title='T-shirts'])[2]") private WebElement Tshirt;
	
	//3.identity action on Webelement
	
	public void clickOnSignIn() {
		Sign_in.click();
	}
	
	public String getPageTitle() {
		return (ldriver.getTitle());
		
	}
	
	public void clickOnThirt() {
		 Tshirt.click();
	}
}
