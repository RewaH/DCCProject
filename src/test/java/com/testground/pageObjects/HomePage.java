package com.testground.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.testground.common.BaseClass;

import net.bytebuddy.asm.Advice.This;

public class HomePage {
	
	static WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver= driver;
	}
	BaseClass obj= new BaseClass();
	
	public WebDriver callDriver() {
		 driver= obj.getDriver();
	return driver;
	}
	
	
	By clothes = By.className("dropdown-item");
	
	public void click_Clothes() {
		driver.findElement(clothes).click();
	}
	

	
	
	
	

}
