package com.testpages;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.BaseClass.Baseclass;
import com.pages.AddCartPage;
import com.pages.Homepage;
import com.pages.ShoppingCartPage;

public class Test_TC_019 extends Baseclass {

	Homepage hp;
	AddCartPage ap;
	ShoppingCartPage sp;

	@BeforeSuite
	public void setup() {
		initialization();
		reportInit();
	}
	
	
	@Test
	public void test019() {
		
	}
}
