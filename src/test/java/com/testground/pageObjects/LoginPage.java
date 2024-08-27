package com.testground.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.testground.common.BaseClass;

public class LoginPage extends BaseClass{
	//page object model
	static WebDriver driver;
	BaseClass obj= new BaseClass();

	By signin=By.partialLinkText("Sign");
	By email= By.name("email");
	By password= By.name("password");
	By submitBtn=By.id("submit-login");

	
	public LoginPage(WebDriver driver) {
		this.driver= driver;
	}

	public WebDriver setupDriver() {
		driver =obj.getDriver();
		return driver;
		
	}
	
	public void click_signin() {
		driver.findElement(signin).click();
		
	}
	public void enter_username(String userName) {
		driver.findElement(email).sendKeys(userName);
		
	}
	
	public void enter_pwd(String pwd) {
		driver.findElement(password).sendKeys(pwd);
		
	}
	public void click_submitBtn() {
		driver.findElement(submitBtn).click();
		
	}
	public String get_title() {
		String actualTitle=driver.getTitle();
		return actualTitle;
		
	}
}
