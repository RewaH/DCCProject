package com.testground.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.testground.common.BaseClass;

public class MyAccountPage {

	static WebDriver driver;
	
	  public MyAccountPage(WebDriver driver) {
		  this.driver=driver;
	  }
	  
	BaseClass obj =  new BaseClass();
	
	public WebDriver callDriver() {
		driver= obj.getDriver();
		
		return driver;	
	}
	
	
	By home= By.name("Home");
	
	
	
	public void click_home() {
		driver.findElement(home).click();
	}
	

}
