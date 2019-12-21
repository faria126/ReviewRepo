package com.bit.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
 
	
	@FindBy(id="email") WebElement userIdTextBox;
	@FindBy(id="pass") WebElement passTextBox;
	@FindBy(id="u_0_2") WebElement loginButton;
	String userid="myuserid";
	String password="mypass";
	
			
	public void clickInSearchButton() {
		
	}
	
	public void searchToysInSearchTextBox() {
		
	}

	
	public void clickInChristmasToys() {
		
	}
	
	public void AddTheProductInTheShoppingCart() {
		
		
	}
	public void submitOrder() {
		
	}
}
