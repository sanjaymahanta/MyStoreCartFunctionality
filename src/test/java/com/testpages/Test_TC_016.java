package com.testpages;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.BaseClass.Baseclass;
import com.Utilities.WaitUtils;
import com.pages.AddCartPage;
import com.pages.Homepage;
import com.pages.ShoppingCartPage;

public class Test_TC_016 extends Baseclass{

	Homepage hp;
	AddCartPage ap;
	ShoppingCartPage sp;
	
	
	
	@BeforeSuite
	public void setup() {
		initialization();
		reportInit();
		
	}
	
	
	@Test
	public void test016() throws Exception {
		hp = new Homepage(driver);
		hp.TC_001();
		ap = new AddCartPage(driver);
		ap.tabAddCart();
		ap.tabProcedCheckBtn();
		sp = new ShoppingCartPage(driver);
		//sp.increaseQuantity();
		sp.checkPrice(1);
		
		
				
	}
	
	
	
	
}
