package com.testpages;


import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.BaseClass.Baseclass;
import com.pages.AddCartPage;
import com.pages.Homepage;
import com.pages.ShoppingCartPage;

public class Test_TC_022 extends Baseclass {

	
	Homepage hp;
	AddCartPage ap;
	ShoppingCartPage sp;

	@BeforeSuite
	public void setup() {
		initialization();
		reportInit();
	}
	
	@Test
	public void test022() {
		hp = new Homepage(driver);
		hp.TC_001();
		ap = new AddCartPage(driver);
		ap.tabAddCart();
		ap.tabProcedCheckBtn();
		sp = new ShoppingCartPage(driver);
		sp.verifyLinks();
	}
}
