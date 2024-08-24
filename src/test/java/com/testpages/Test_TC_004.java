package com.testpages;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.BaseClass.Baseclass;
import com.pages.AddCartPage;
import com.pages.Homepage;

public class Test_TC_004 extends Baseclass{

	Homepage hp;
	AddCartPage ap;
	
	
	@BeforeSuite
	
	public void setUp() {
		initialization();
		reportInit();
		
	}
	
	@Test
	public void test04() {
		hp = new Homepage(driver);
		hp.TC_001();
		ap = new AddCartPage(driver);
		ap.quantity("3000");
	    ap.checkMessage();
		ap.messageIsEqual("There are not enough products in stock");
	
	}
	
	//for assertion i made a seperate class in utilities package
	//test case is passed but i havent see 
	

	
	
}
