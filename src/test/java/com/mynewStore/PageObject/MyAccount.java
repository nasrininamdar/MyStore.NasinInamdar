package com.mynewStore.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount {

	
	//1.create object of WebDriver
		WebDriver ldriver;
		
		public MyAccount(WebDriver rdriver) {
			ldriver = rdriver;
			PageFactory.initElements(rdriver, this);  //Search context ,object page
		}
		
		//2.identify WebElements
		
		@FindBy(xpath="(//input[@data-validate='isEmail'])[1]") private WebElement CreateEmail_id;
		@FindBy(xpath="//button[@id='SubmitCreate']") private WebElement createAccountbtn;
		
		//already registered user
		@FindBy(xpath="(//input[@data-validate='isEmail'])[2]") private WebElement RegisterEmailID;
		@FindBy(xpath="//input[@data-validate='isPasswd']") private WebElement RegisterPassword;
		@FindBy(xpath="//button[@id='SubmitLogin']") private WebElement SubmitLogin;
		
		
		//3.identity action on Webelement
		
		public void enterCreateEmailAddress(String emailAdd) {
			CreateEmail_id.sendKeys(emailAdd);
		}
		
		public void clickcreateAccountbtn() {
			createAccountbtn.click();
		}
		
		
		//already Registerd Email address 
		public void enterRegisterEmailAddress(String RgisterEmailId) {
			RegisterEmailID.sendKeys(RgisterEmailId);
		}
		public void enterRegisterPassword(String RgisterPassword) {
			RegisterPassword.sendKeys(RgisterPassword);
		}
		
		
		public void clicksubmitbtn() {
			SubmitLogin.click();
		}
		
		
		

}
