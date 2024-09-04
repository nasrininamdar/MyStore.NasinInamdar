package com.mynewStore.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MyAddressDetails {

	WebDriver ldriver;

	public MyAddressDetails(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//input[@id='firstname']")
	private WebElement addressFirstName;

	@FindBy(xpath = "//input[@id='lastname']")
	private WebElement addresslastName;

	@FindBy(xpath = "//input[@id='address1']")
	private WebElement address;

	@FindBy(xpath = "//input[@id='city']")
	private WebElement cityname;

	@FindBy(xpath = "//select[@id='id_state']")
	private WebElement selectState;
	@FindBy(xpath = "//input[@id='postcode']")
	private WebElement zipcode;
	@FindBy(xpath = "//div[@id='uniform-id_country']")
	private WebElement country;
	@FindBy(xpath = "//input[@id='phone']")
	private WebElement HomePhoneNumber;
	@FindBy(xpath = "//input[@id='phone_mobile']")
	private WebElement MobileNumber;
	@FindBy(xpath = "//input[@id='alias']")
	private WebElement myaddfuture;
	@FindBy(xpath = "//button[@id='submitAddress']")
	private WebElement savebtn;

	public void enteraddressFirstName(String addfname) {
		addressFirstName.sendKeys(addfname);
	}

	public void enteraddressLastName(String addlname) {
		addresslastName.sendKeys(addlname);
	}

	public void enteraddress1(String addrss) {
		addresslastName.sendKeys(addrss);
	}

	public void entercityName(String Ncity) {
		cityname.sendKeys(Ncity);
	}

	public void enterSelectText() {
		Select selvis = new Select(selectState);
		selvis.selectByValue("14");
	}

	public void enterzipcode(String postcode) {
		zipcode.sendKeys(postcode);
	}

//	public void entercountrycode() {
//		Select sel = new Select(country);
//		sel.selectByVisibleText("United States");
//	}

	public void enterHomePhonenumber(String HmPhNumber) {
		HomePhoneNumber.sendKeys(HmPhNumber);
	}

	public void entermobilenumber(String mobileNum) {
		MobileNumber.sendKeys(mobileNum);
	}

	public void enteraddfuture(String futureAdd) {
		myaddfuture.sendKeys(futureAdd);
	}

	public void clickonSavebtn() {
		savebtn.click();
	}
}
