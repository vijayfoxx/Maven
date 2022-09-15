package org.vijay.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.vijay.seleniumBase.Base;

public class LoginPage extends Base {
	//RemoteWebDriver driver=null;
	public LoginPage(RemoteWebDriver driver){
		this.driver=driver;
		
	}
	public boolean getUsernameLabel() {
		return driver.findElement(By.xpath("//label[@for='user_name']")).isDisplayed();
	}
	public boolean getPasswordLabel() {
		return driver.findElement(By.xpath("//label[@for='user_password']")).isDisplayed();
	}
	public LoginPage enterUserName(String username){
		driver.findElement(By.id("user_name")).sendKeys(username);
		return this;

	}
	public LoginPage enterUserPassword(String password){
		driver.findElement(By.id("user_password")).sendKeys(password);
		return this;
	}
	public void selectLanguage(String lang){ 

	}
	public DashboardPage clickLogin(){
		driver.findElement(By.id("sysverb_login")).click();
		return new DashboardPage();

	}
	public void forgotPassword() {
		driver.findElement(By.linkText("Forgot Password ?")).click();
	}
	public void logn(String username ,String password) {
		enterUserName(username);
		enterUserPassword(password);
		clickLogin();
	}
}
