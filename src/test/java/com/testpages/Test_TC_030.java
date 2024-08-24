package com.testpages;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.BaseClass.Baseclass;
import com.pages.AddCartPage;
import com.pages.AddressPage;
import com.pages.Homepage;
import com.pages.PaymentPage;
import com.pages.PersonalInformation;
import com.pages.ShipmentPage;
import com.pages.ShoppingCartPage;

public class Test_TC_030 extends Baseclass{

	
		Homepage hp;
		AddCartPage ap;
		ShoppingCartPage sp;
		PersonalInformation pi;
		AddressPage adp;
		ShipmentPage shp;
		PaymentPage pp;

		@BeforeSuite
		public void setup() {
			initialization();
			reportInit();
		}
		
		 @BeforeMethod
		    public void initializePages() {
		        hp = new Homepage(driver);
		        ap = new AddCartPage(driver);
		        sp = new ShoppingCartPage(driver);
		        pi = new PersonalInformation(driver);
		        adp = new AddressPage(driver);
		        shp = new ShipmentPage(driver);
		        pp = new PaymentPage(driver);
		    }

		@Test(priority = 1)
		public void testPaymentPage() throws Exception {
		
			hp.TC_001();
		
			ap.tabAddCart();
			ap.tabProcedCheckBtn();
		
			sp.proceddToCheckout();
		
			pi.fillFormsingledata("Sanjay", "kumar", "hxu9e@gmail.com");
		
			adp.writeAddress("neyyork");
			adp.typeCity("newyork");
			adp.writePostCode("10001");
			adp.selectState();
			adp.clickContinue();
		
			shp.clickContinue();
		
}
		
		@Test(priority = 2)
		public void payByCheque() {
			pp = new PaymentPage(driver);
			pp.selectCheck();
			pp.selectcheckbox();
			pp.placeOrder();
		}
		
		@Test
		public void payByBankWire() {
			pp = new PaymentPage(driver);
			pp.selectBankWire();
			pp.selectcheckbox();
			pp.placeOrder();
					
		}
		
		
		@Test
		public void payByCashdelivery() {
			pp = new PaymentPage(driver);
			pp.selectCashDelivery();
			pp.selectcheckbox();
			pp.placeOrder();
					
		}
}