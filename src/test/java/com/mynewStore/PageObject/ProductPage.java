package com.mynewStore.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductPage {


		
		//1.create object of WebDriver
		WebDriver ldriver;
		
		public ProductPage(WebDriver rdriver) {
			ldriver = rdriver;
			PageFactory.initElements(rdriver, this);  //Search context ,object page
		}
		
		//2.identify WebElements
		//
		@FindBy(xpath="//input[@id='quantity_wanted']") private WebElement quantityWanted;
		@FindBy(xpath="//select[@id='group_1']") private WebElement size;
		@FindBy(xpath="//p[@id=\"add_to_cart\"]") private WebElement addtocart;
		@FindBy(xpath="//a[@title=\"Proceed to checkout\"]") private WebElement proceedtocheckout;
		//3.identity action on Webelement
		
		public void setsize(String sizetype) {
			Select SizeSel=new Select(size);
			SizeSel.selectByVisibleText(sizetype);
		}
		
		
		public void setQuantity(String qtr) {
			quantityWanted.clear();
			quantityWanted.sendKeys(qtr);
		}
		
		public void clickOnAddToCart() {
			addtocart.click();;
			
		}
		public void clickOnProceedTocheckout() {
			proceedtocheckout.click();;
			
		}

	
}
