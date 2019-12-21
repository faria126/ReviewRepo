package com.bit.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	WebDriver driver;
	public void OpenBrowser() {
		driver=new ChromeDriver();
		
		
		
	}
	public HomePage navigateToUrl() {
		driver.get("https://www.amazon.com");
		return new HomePage(driver);
		
		
	}
}
