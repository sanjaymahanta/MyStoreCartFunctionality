package com.testpages;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.BaseClass.Baseclass;
import com.pages.AddCartPage;
import com.pages.Homepage;

public class Test_TC_008 extends Baseclass{

	
	Homepage hp;
	AddCartPage ap;
	
	
	@BeforeSuite
	public void setup() {
		initialization();
		reportInit();
		
	}
	
	
	@Test
	public void test08() {
		hp = new Homepage(driver);
		hp.TC_001();
		ap = new AddCartPage(driver);
		ap.tabAddCart();
		ap.clickContShopping();
	}
	
}