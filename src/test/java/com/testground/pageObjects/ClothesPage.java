package com.testground.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.testground.common.BaseClass;

public class ClothesPage {

	static WebDriver driver;
		
	 public ClothesPage(WebDriver driver) {
			this.driver= driver;
		}
	 
		BaseClass obj= new BaseClass();
		
		public WebDriver callDriver() {
			 driver= obj.getDriver();
		return driver;
		}
		
		
		By menCategory = By.className("custom-checkbox");
		By tshirtBlack =By.cssSelector("img[loading='lazy']");
		
		public void checkBoxMenCategory() {
			driver.findElement(menCategory).click();
		}
		

		public void clic_Tshirt() {
			driver.findElement(menCategory).click();
		}

		
		
		
		

	}



