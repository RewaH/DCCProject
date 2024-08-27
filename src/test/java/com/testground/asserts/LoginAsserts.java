package com.testground.asserts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.testground.common.BaseClass;

public class LoginAsserts extends BaseClass {
	static WebDriver driver;
	BaseClass obj= new BaseClass();

	
	public LoginAsserts(WebDriver driver) {
     this.driver=driver;
	}
	
	
	public String assertTitle(){
		String actualTitle=driver.getTitle();
		
		return actualTitle;
		
		
	}

	public void assertTitle1(String expectedTitle, String actualTitle){
 
		 Assert.assertEquals(actualTitle,expectedTitle );

		
		
	}

	
	
}
