package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utilities.Dropdown;
import com.Utilities.NavigateUtils;
import com.Utilities.WaitUtils;

public class TC_002 {

	@FindBy(xpath = "(//a[text()='Hummingbird printed sweater'])[1]")
	WebElement sweater;

	@FindBy(id = "group_1")
	WebElement size;

	@FindBy(xpath = "(//button[@type='submit'])[1]")
	WebElement addtoCart;

	@FindBy(xpath = "//a[text()='Proceed to checkout']")
	WebElement tabProceed;

	public TC_002(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void selectSweater() {
		sweater.click();
	}

	public void selectSize(String value) {
		Dropdown.selectByValue(size, value);
		size.click();
	}

	public void tabAddCart() {
		addtoCart.click();
	}

	public void tabProcedCheckBtn() {
		WaitUtils.waitElement(tabProceed);
		tabProceed.click();
	}

	
	
	public void apllicationWait() {
		WaitUtils.waitApplication();
	}

}
