package com.store.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mynewStore.PageObject.AccountCreationDetails;
import com.mynewStore.PageObject.IndexPage;
import com.mynewStore.PageObject.MyAccount;
import com.mynewStore.PageObject.MyAddressDetails;
import com.mynewStore.PageObject.MyaccountPageForAddress;
import com.mynewStore.PageObject.RegisteredUserAccount;

public class TC_myAccountPage_test extends BaseClass {

	@Test(enabled = false)
	public void verifyRegisterationandLogin() throws InterruptedException {

		IndexPage Indexpg = new IndexPage(driver);
		Indexpg.clickOnSignIn();
		logger.info("click on sign in button");

		MyAccount pgMyAccount = new MyAccount(driver);
		pgMyAccount.enterCreateEmailAddress("inamda30@gmail.com");
		logger.info("email address enter create account section ");

		pgMyAccount.clickcreateAccountbtn();
		logger.info("clicked on create an account button ");

		AccountCreationDetails accountcreatepg = new AccountCreationDetails(driver);

		accountcreatepg.selectTitleMrs();
		accountcreatepg.enterCustmerFirstName("nasrin");
		accountcreatepg.enterCustomerLastName("inamdar");
		accountcreatepg.enterPwd("Nasrin@123");

		accountcreatepg.clickOnRegister();
		logger.info("click on Register button");

		Thread.sleep(2000);

		MyaccountPageForAddress myaccoutPage = new MyaccountPageForAddress(driver);

		myaccoutPage.clickaddMyFirstAddress();

		MyAddressDetails myAddrsspg = new MyAddressDetails(driver);
		myAddrsspg.enteraddressFirstName("mp-aatpadi");
		myAddrsspg.enteraddressLastName("inamdar");
		myAddrsspg.enteraddress1("sangli");
		myAddrsspg.entercityName("atpadi");
		myAddrsspg.enterSelectText();
		myAddrsspg.enterzipcode("23453");
		// myAddrsspg.entercountrycode();
		myAddrsspg.enterHomePhonenumber("6532344556");
		myAddrsspg.entermobilenumber("4564564567");
		myAddrsspg.enteraddfuture("my address1");
		myAddrsspg.clickonSavebtn();

		RegisteredUserAccount registeruser = new RegisteredUserAccount(driver);
		String username = registeruser.getUsername();

		Assert.assertEquals("Nasrin inamdar ", username);
	}

	@Test
	public void verifyLogin() throws IOException {
		logger.info("verify login test execution started.....");
		IndexPage Indexpg = new IndexPage(driver);
		Indexpg.clickOnSignIn();
		logger.info("click on sign in button");

		MyAccount pgMyAccount = new MyAccount(driver);

		pgMyAccount.enterRegisterEmailAddress("inamdar24nasrin@gmail.com");
		pgMyAccount.enterRegisterPassword("12345");
		pgMyAccount.clicksubmitbtn();

		RegisteredUserAccount registeruser = new RegisteredUserAccount(driver);
		String username = registeruser.getUsername();
		if (username.equals("Nasrin inamdar")) {
			logger.info("verify Login - passed ");

			Assert.assertTrue(true);
		} else {
			logger.info("verify failed");
			capuringScreenshot(driver, "verifyLogin");
			Assert.assertTrue(false);
		}

	}
	
	
}
