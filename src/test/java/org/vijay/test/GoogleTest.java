package org.vijay.test;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.vijay.seleniumBase.Browser;
import org.vijay.seleniumBase.Locators;
import org.vijay.seleniumBase.SeleniumBase;

public class GoogleTest extends SeleniumBase {
	@Test
	void searchLetcode() throws InterruptedException {
		setUp(Browser.CHROME, "https://www.google.com/");
//		WebElement search = element(Locators.name, "q");
		type(element(Locators.name, "q"), 
				"hello",
				Keys.ENTER);
//		Thread.sleep(3000);
		quit();
	}
}

