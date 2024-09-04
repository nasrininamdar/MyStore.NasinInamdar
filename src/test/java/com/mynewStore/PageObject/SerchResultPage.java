package com.mynewStore.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SerchResultPage {
WebDriver ldriver;
	
	public SerchResultPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);  //Search context ,object page
	}
	
	//2.identify WebElements
	////a[@class='button lnk_view btn btn-default']
	@FindBy(xpath="(//a[@title='Faded Short Sleeve T-shirts'])[2]") private WebElement serchResultProduct ;
	@FindBy(xpath="//a[@class='button lnk_view btn btn-default']") private WebElement more ;
	
	//3.identity action on Webelement
	
	public String getserchResultProductName() {
		return serchResultProduct.getText();
	}

	public void clickOnMorelink() {
		more.click();
	}

}
