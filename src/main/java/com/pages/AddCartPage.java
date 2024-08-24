package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Utilities.AssertUtils;
import com.Utilities.Dropdown;
import com.Utilities.JsExecutorUtils;
import com.Utilities.NavigateUtils;
import com.Utilities.WaitUtils;

public class AddCartPage {

	@FindBy(id = "group_1")
	WebElement size;

	@FindBy(id = "quantity_wanted")
	WebElement quantity;

	@FindBy(xpath = "(//button[@type='submit'])[1]")
	WebElement addCart;

	@FindBy(xpath = "//a[text()='Proceed to checkout']")
	WebElement tabProceed;

	@FindBy(xpath = "//div[@id='_mobile_logo']//img")
	WebElement myStore;

	@FindBy(xpath = "(//div[@class='product-description'])[3]")
	WebElement hposter;

	@FindBy(id = "category-3")
	WebElement cloths;

	@FindBy(id = "category-6")
	WebElement accessories;

	@FindBy(id = "category-9")
	WebElement art;

	@FindBy(id = "group_3")
	WebElement dimension;

	@FindBy(xpath = "(//div[@class='thumbnail-top']//img)[2]")
	WebElement mug;

	@FindBy(xpath = "(//div[@class='thumbnail-top']//img)[2]")
	WebElement frame;

	@FindBy(id = "product-availability")
	WebElement stockLimit;

	@FindBy(xpath = "//button[text()='Continue shopping']")
	WebElement contShop;

	@FindBy(xpath = "//i[text()='delete']")
	WebElement delete;

	@FindBy(xpath = "//span[text()='There are no more items in your cart']")
	WebElement empty;
	
	@FindBy(xpath = "//i[text()='chevron_left']")
	WebElement continueLink;

	public AddCartPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public void sizeSweater(String value) {

		Dropdown.selectByValue(size, value);
		size.click();

	}

	public void quantity(String qnumber) {
		WaitUtils.waitApplication();
		quantity.sendKeys(qnumber);
	}

	public void tabAddCart() {
		addCart.click();
	}

	public void tabProcedCheckBtn() {
		WaitUtils.waitElement(tabProceed);
		tabProceed.click();
	}

	public void back() {
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

	public void linkColthes() {
		cloths.click();

	}

	public void linkAccessories() {
		accessories.click();

	}

	public void clickMug() {
		mug.click();

	}

	public void linkArt() {
		art.click();

	}

	public void clickFrame() {
		frame.click();

	}

	public void maximumLimit() {
		stockLimit.getText();
	}

	public void checkMessage() {

		AssertUtils.display(stockLimit);

	}

	public void messageIsEqual(String expected) {

		AssertUtils.compare(stockLimit, expected);

	}

	public void clickContShopping() {
		WaitUtils.waitElement(contShop);
		contShop.click();
	}

	public void deleteIcon() {
		delete.click();
	}

	public void emptyCart() {
		WaitUtils.waitElement(empty);
		AssertUtils.display(empty);
	}

	public void messageEmptyCart(String expected) {
		WaitUtils.waitElement(empty);
		AssertUtils.compare(empty, expected);
	}
	
	public void continueEmptyCart() {
		continueLink.click();
	}
}