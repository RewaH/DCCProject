package com.testground.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.testground.common.BaseClass;

public class LoginPage extends BaseClass{
	//page object model
	static WebDriver driver;
	BaseClass obj= new BaseClass();

	By userName= By.name("username");
	By password= By.name("password");
	By login =By.cssSelector("button[type='button']");

	
	public LoginPage(WebDriver driver) {
		this.driver= driver;
	}

	public WebDriver setupDriver() {
		driver =obj.getDriver();
		return driver;
		
	}

	public void enter_username(String userName) {
		driver.findElement(this.userName).sendKeys(userName);
		
	}
	
	public void enter_pwd(String pwd) {
		driver.findElement(password).sendKeys(pwd);
		
	}
	public void click_submitBtn() {
		driver.findElement(login).click();
		
	}
	public String get_title() {
		String actualTitle=driver.getTitle();
		return actualTitle;
		
	}
}
