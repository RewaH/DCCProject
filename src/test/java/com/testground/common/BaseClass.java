package com.testground.common;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	 public static WebDriver driver;

	    public WebDriver getDriver() {
	        WebDriverManager .chromedriver().setup();
	        ChromeOptions options=new ChromeOptions();
	        options.addArguments("--remote--allow--origin--");
	         driver=new ChromeDriver(options);


	        return driver;}
	    
	    public WebDriver getDriverHeadlessMood() {
	        WebDriverManager .chromedriver().setup();
	        ChromeOptions options=new ChromeOptions();
	        options.addArguments("--remote--allow--origin=*");
	        options.addArguments("headless");
	        driver=new ChromeDriver(options);
	        return driver;}
	    
	    public WebDriver getfireFoxDriver() {
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions options = new FirefoxOptions();
			driver= new FirefoxDriver(options);
	    	
	    	return driver;
	         
	    	
	    	
	    }
	    
	    public void launchBrowser(String baseUrl)  {

	        driver.get(baseUrl);
	        driver.manage().window().maximize();
	        System.out.println(driver.getTitle());
	        driver.manage().timeouts().implicitlyWait((Duration.ofSeconds(5)));
	    }

	    public void closeBrowser() {
	        if (driver!=null) {
	            driver.quit();
	        }
	    }


	}


