package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.Utilities.Dropdown;
import com.Utilities.NavigateUtils;
import com.Utilities.WaitUtils;

public class TC_003 {

	@FindBy(id = "group_1")
	WebElement size;

	@FindBy(id = "quantity_wanted")
	WebElement quantity;

	@FindBy(xpath = "(//button[@type='submit'])[1]")
	WebElement addCart;

	@FindBy(xpath = "//a[text()='Proceed to checkout']")
	WebElement tabProceed;

	@FindBy(xpath = "//div[@id='_mobile_logo']//a")
	WebElement myStore;
	

	@FindBy(id = "category-3")
	WebElement cloths;
	
	
	@FindBy(xpath = "(//div[@class='product-description'])[3]")
	WebElement hposter;
	
	@FindBy(id = "group_3")
	WebElement dimension;
	
	

	public TC_003(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public void sizeSweater(String value) {

		Dropdown.selectByValue(size, value);
		size.click();

	}

	public void quantity(String qnumber) {
		quantity.sendKeys(qnumber);
	}

	public void tabAddCart() {
		addCart.click();
	}

	public void tabProcedCheckBtn() {
		WaitUtils.waitElement(tabProceed);
		tabProceed.click();
	}

	public void prevoiusAction() {
		NavigateUtils.navigatebackward();
	}

	public void logoMyStore() {
		myStore.click();
	}
	
	public void homePagePoster() {
		hposter.click();
	}
	
	public void dimensionPoster(String value) {
		Dropdown.selectByValue(dimension, value);
		dimension.click();
	}
	
	public void clothLInk() {
		cloths.click();
	}
}