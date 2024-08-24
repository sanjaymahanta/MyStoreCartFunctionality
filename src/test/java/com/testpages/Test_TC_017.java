package com.testpages;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.BaseClass.Baseclass;
import com.pages.AddCartPage;
import com.pages.Homepage;
import com.pages.ShoppingCartPage;

public class Test_TC_017 extends Baseclass {

	Homepage hp;
	AddCartPage ap;
	ShoppingCartPage sp;

	@BeforeSuite
	public void setup() {
		initialization();
		reportInit();
	}

	@Test
	public void test017() throws Exception {
		hp = new Homepage(driver);
		hp.TC_001();
		ap = new AddCartPage(driver);
		ap.tabAddCart();
		ap.tabProcedCheckBtn();
		sp = new ShoppingCartPage(driver);
		sp.cartQuantityBox("5000");
		sp.checkMessage();
		sp.messageIsEqual("You can only buy 1197 \"Hummingbird printed sweater\". Please adjust the quantity in your cart to continue.");

	}
}
