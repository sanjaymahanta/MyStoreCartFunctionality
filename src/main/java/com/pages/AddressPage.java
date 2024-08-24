package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.Baseclass;
import com.Utilities.Dropdown;
import com.Utilities.JsExecutorUtils;

public class AddressPage  {
	@FindBy(id = "field-address1")
	WebElement address;

	@FindBy(id = "field-city")
	WebElement city;

	@FindBy(id = "field-id_state")
	WebElement state;

	@FindBy(id = "field-postcode")
	WebElement postCode;

	@FindBy(id = "field-id_country")
	WebElement country;
	
	@FindBy(id = "use_same_address")
	WebElement invoice;

	@FindBy(name = "confirm-addresses")
	WebElement continueTab;

	
	
	public AddressPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void writeAddress(String userAddress) {
		address.sendKeys(userAddress);
	}
	
	public void typeCity(String userCity) {
		city.sendKeys(userCity);
	}
	
	public void selectState() {
		Dropdown.selectByValue(state, "35");
		
	}
	public void writePostCode(String userCode) {
		postCode.sendKeys(userCode);
	}
	
	public void selectCountry() {
		Dropdown.selectByValue(country, "21");
	}
	
	public void checkInvoice() {
		JsExecutorUtils.scroll(invoice);
		JsExecutorUtils.clickElememnt(invoice);
	}
	
	public void clickContinue() {
		JsExecutorUtils.scroll(continueTab);
		JsExecutorUtils.clickElememnt(continueTab);
	}
	
}
