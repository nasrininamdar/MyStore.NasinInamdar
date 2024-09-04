package com.mynewStore.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountCreationDetails {
	

	//1.create object of WebDriver
	WebDriver ldriver;
	
	public AccountCreationDetails(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);  //Search context ,object page
	}
	
	//2.identify WebElements
	
	@FindBy(xpath="//input[@id='id_gender2']") private WebElement titleMrs;
	@FindBy(xpath="//input[@name='customer_firstname']") private WebElement customerfirstName;
	@FindBy(xpath="//input[@name='customer_lastname']") private WebElement  customerlastName;
    @FindBy(xpath="//input[@id='email']") private WebElement emaiId;
    @FindBy(xpath="//input[@id='passwd']") private WebElement password;
    @FindBy(xpath="//button[@id='submitAccount']") private WebElement registerbutton;
    
	//3.identity action on Webelement
	
	public void selectTitleMrs() {
		titleMrs.click();
	}

	
	public void enterCustmerFirstName(String fname) {
		customerfirstName.sendKeys(fname);
	}

	
	public void enterCustomerLastName(String lname) {
		customerlastName.sendKeys(lname);
		
	}
	
	
	
	public void enterPwd(String Pwd) {
		password.sendKeys(Pwd);
		
	}
	
	
	public void clickOnRegister() {
		registerbutton.click();
	}
	
	
	
}
