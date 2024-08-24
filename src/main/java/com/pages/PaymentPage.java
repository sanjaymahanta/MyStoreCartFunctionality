package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {
	@FindBy(id = "payment-option-1")
	WebElement check;

	@FindBy(id = "payment-option-2")
	WebElement banWire;

	@FindBy(id = "payment-option-3")
	WebElement cod;
	
	@FindBy(id = "conditions_to_approve[terms-and-conditions]")
	WebElement tickTerm;
	
	
	@FindBy(xpath = "//a[text()='terms of service']")
	WebElement service;
	
	@FindBy(xpath = "//a[text()='Terms and conditions of use']")
	WebElement use;
	
	@FindBy(xpath = "//div[@id='payment-confirmation']//child::button")
	WebElement tabPlace;
	

	public PaymentPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void selectCheck() {
		check.click();
	}

	public void selectBankWire() {
		banWire.click();
	}

	public void selectCashDelivery() {
		cod.click();
	}
	
	public void clcikTermsUse() {
		use.click();
	}
	
	public void clcikTermsService() {
		service.click();
	}
	
	public void selectcheckbox() {
		tickTerm.click();
	}
	
	public void placeOrder() {
		tabPlace.click();
	}
}
