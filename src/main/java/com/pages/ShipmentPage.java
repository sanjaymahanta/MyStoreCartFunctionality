package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShipmentPage {

	@FindBy(id ="delivery_message")
	WebElement comment;
	
	@FindBy(xpath = "(//button[@type='submit'])[5]")
	WebElement tabContinue;
	
	
	public ShipmentPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void wishingComment(String wish) {
		comment.sendKeys(wish);
	}
	
	public void clickContinue() {
		tabContinue.click();
	}
	
	
	
	
}
