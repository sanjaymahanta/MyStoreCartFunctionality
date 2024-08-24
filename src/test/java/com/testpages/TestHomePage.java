package com.testpages;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.BaseClass.Baseclass;
import com.pages.Homepage;
import com.pages.TC_002;

public class TestHomePage extends Baseclass{

	
	Homepage hp = null;
	
	@BeforeSuite
	public void setup() {
		initialization();
		reportInit();
		hp = new Homepage(driver);
		
	}
	@Test
	public void test01() {
		hp.TC_001();
		
	}
	
	
}
