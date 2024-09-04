package com.mynewStore.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisteredUserAccount {

	WebDriver ldriver;

	public RegisteredUserAccount(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this); // Search context ,object page
	}

	// 2.identify WebElements

	@FindBy(xpath = "//a[@title='View my customer account']")
	private WebElement Username;
	@FindBy(xpath = "//a[@class='logout']")
	private WebElement signout;
	@FindBy(xpath = "//input[@id='search_query_top']")
	private WebElement serchbox;
	@FindBy(xpath = "//button[@name='submit_search']")
	private WebElement serchsubmit;
	@FindBy(xpath = "//a[@title='Women']")
	private WebElement womenMenu;
	@FindBy(xpath = "(//a[@title='T-shirts'])[2]")
	private WebElement TshirtMenu;

//	@FindBy(xpath="//a[@class='logout']") private WebElement more;
	public void clickOnSignOut() {
		signout.click();
	}

	public String getUsername() {

		String text = Username.getText();
		return text;
	}
	
	public void EnterDataintoserchBox(String serchKey) {
		 serchbox.sendKeys(serchKey);
		
	}

	


	public void clickOnSerchbutton() {
		serchsubmit.click();
	}

	
	
	
	
	
	
	
	
}
