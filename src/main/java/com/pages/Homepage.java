package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.BaseClass.Baseclass;

public class Homepage {

	@FindBy(xpath = "(//a[text()='Hummingbird printed sweater'])[1]")
	WebElement sweater;
	
	
	
	
	public  Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@Test
	public void TC_001() {
		sweater.click();
	}
	
	
	
}
