package Utility;

import org.openqa.selenium.WebElement;

public class Helper {
	
		public static void type( WebElement element, String text) {
			element.sendKeys(text);	
		}
		public static void click (WebElement element) {
			element.click();
		}
		

}
