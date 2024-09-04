package com.store.TestCases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mynewStore.PageObject.IndexPage;
import com.mynewStore.PageObject.MyAccount;
import com.mynewStore.PageObject.OrderAddressPage;
import com.mynewStore.PageObject.OrderConfirmationPage;
import com.mynewStore.PageObject.OrderPaymentPage;
import com.mynewStore.PageObject.OrderShippingPage;
import com.mynewStore.PageObject.OrderSumaryPage;
import com.mynewStore.PageObject.ProductPage;
import com.mynewStore.PageObject.RegisteredUserAccount;
import com.mynewStore.PageObject.SerchResultPage;

public class TC_productPageTest extends BaseClass {

	@Test(enabled = true)
	public void verifysearchProductTest() throws IOException {
		String serchkey = "T-shirts";
		logger.info("\n******************TestCases serch Product Started*****************");

		// Sign in
		IndexPage Indexpg = new IndexPage(driver);
		Indexpg.clickOnSignIn();

        //Enter account details email password 
		MyAccount pgMyAccount = new MyAccount(driver);

		pgMyAccount.enterRegisterEmailAddress("inamdar24nasrin@gmail.com");
		pgMyAccount.enterRegisterPassword("12345");
		pgMyAccount.clicksubmitbtn();

		//Enter searchkey in serchbox
		RegisteredUserAccount productpg=new RegisteredUserAccount(driver);
		productpg.EnterDataintoserchBox(serchkey);
		productpg.clickOnSerchbutton();
		
		
		//get name from search product
		SerchResultPage resultpg= new SerchResultPage(driver);
		String searchResultProductName = resultpg.getserchResultProductName();
		
		//If correct product is displaying after search
		
		if(searchResultProductName.contains(serchkey)) {
			logger.info("searchResulttestCasePassed");
		Assert.assertTrue(true);
		productpg.clickOnSignOut();}else {
			logger.info("searchResulttestCase----failed");
			Assert.assertTrue(false);
			capuringScreenshot(driver,"verify serch product");
		}
		logger.info("test cases serch product ends ....");
}
	
	@Test(enabled=true)
	public void verifyBuyProject() throws IOException, InterruptedException{	
		logger.info("\n******************TestCases Buy Product Started*****************");

		// Sign in
		IndexPage Indexpg = new IndexPage(driver);
		Indexpg.clickOnSignIn();

		
		   //Enter account details email password 
				MyAccount pgMyAccount = new MyAccount(driver);

				pgMyAccount.enterRegisterEmailAddress("inamdar24nasrin@gmail.com");
				pgMyAccount.enterRegisterPassword("12345");
				pgMyAccount.clicksubmitbtn();
		
		
				
				RegisteredUserAccount productpg=new RegisteredUserAccount(driver);
				productpg.EnterDataintoserchBox("T-shirts");
				
				logger.info("T shirts entered into serch box..");
				
				productpg.clickOnSerchbutton();
				
				SerchResultPage resultpg= new SerchResultPage(driver);
				resultpg.clickOnMorelink();
				
				Thread.sleep(4000);
				
				 ProductPage  projpg=new  ProductPage (driver);
				 projpg.setsize("M");
				 projpg.setQuantity("2");
				 projpg.clickOnAddToCart();
				 
				 
				 OrderSumaryPage  ordersumpg=new OrderSumaryPage(driver);
				 
				 ordersumpg.clickOnProceedToCheckout();
				 
				 
				 OrderAddressPage orderAddPg=new OrderAddressPage(driver);
				 orderAddPg.clickOnProceedToCheckout();
				 
				 OrderShippingPage orderShipPg =new OrderShippingPage(driver);
				 orderShipPg.selectTermsService();
				 orderShipPg.clickOnProceedToCheckout();
				 
				 OrderPaymentPage ordrpayPg=new OrderPaymentPage(driver);
				 ordrpayPg.clickOnPayByCheck();
				 
				 OrderConfirmationPage ordrConfmPg=new OrderConfirmationPage(driver);
				 ordrConfmPg.clickOnConfirmorder();
				String successmsg = ordrConfmPg.getOrderSuccessMassage();
				 if(successmsg.equals("your order in my store is complete")) {
					 Assert.assertTrue(true);

					 ordrConfmPg.clickOnSignOut();
//				 }else {
//					capuringScreenshot(driver,"verifyBuyProducyt"); 
//					 Assert.assertTrue(false);
//				 }}
				 
	
				 }}
	
			

				 @Test
				public void VerifySignOut() throws IOException {
						// Sign in
						IndexPage Indexpg = new IndexPage(driver);
						Indexpg.clickOnSignIn();

						
						   //Enter account details email password 
								MyAccount pgMyAccount = new MyAccount(driver);

								pgMyAccount.enterRegisterEmailAddress("inamdar24nasrin@gmail.com");
								pgMyAccount.enterRegisterPassword("12345");
								pgMyAccount.clicksubmitbtn();
						
						//Sine out
								RegisteredUserAccount productpg=new RegisteredUserAccount(driver);
								productpg.clickOnSignOut();
								
								
								if(Indexpg.getPageTitle().equals("Login -My Store")) {
									Assert.assertTrue(true);
//								}else {
//									capuringScreenshot(driver,"verifySignOut");
//									Assert.assertTrue(false);
//								}
				 }
				 
				 
				 
				 }		 
	
}


