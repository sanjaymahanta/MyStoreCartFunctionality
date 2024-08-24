package com.testpages;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.BaseClass.Baseclass;
import com.pages.AddCartPage;
import com.pages.Homepage;
import com.pages.PersonalInformation;
import com.pages.ShoppingCartPage;

public class Test_TC_023 {

	public class Test_TC_022 extends Baseclass {

		Homepage hp;
		AddCartPage ap;
		ShoppingCartPage sp;
		PersonalInformation pi;

		@BeforeSuite
		public void setup() {
			initialization();
			reportInit();
		}

		@Test
		public void test022() throws Exception {
			hp = new Homepage(driver);
			hp.TC_001();
			ap = new AddCartPage(driver);
			ap.tabAddCart();
			ap.tabProcedCheckBtn();
			sp = new ShoppingCartPage(driver);
			sp.proceddToCheckout();
			pi = new PersonalInformation(driver);
			pi.fillFormsingledata("Sanjay", "kumar", "hxue@gmail.com");
			
		}
	}
}