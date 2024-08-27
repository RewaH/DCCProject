package com.testground.stepsdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.testground.asserts.LoginAsserts;
import com.testground.common.BaseClass;
import com.testground.pageObjects.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
	static WebDriver driver;
	BaseClass obj= new BaseClass();
	LoginPage login= new LoginPage(driver); //we create constructor in login page to establish  a connection to use the page object class
	LoginAsserts logAssert=new LoginAsserts(driver);

	@Given("user is on login page")
	public void user_is_on_login_page() {
		 login.setupDriver();
			obj.launchBrowser("https://testground.internsified.com/");
			login.click_signin();
			
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("done");
		login.enter_username("pritizipy1@gmail.com");
	//	driver.findElement(By.name("email")).sendKeys("pritizipy1@gmail.com");
		login.enter_pwd("123456");
	}
 
	@And("clicks on login button")
	public void clicks_on_login_button() {
		login.click_submitBtn();
		
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		String expectedTitle= "My account";
		String actualTitle=login.get_title();

		 logAssert.assertTitle1(expectedTitle,actualTitle);
		
	
	}

	@Then("user close the browser")
	public void user_close_the_browser() {
	   obj.closeBrowser();
	}
	
	
	
/*	@Given("user is on the sign up page")
	public void user_is_on_the_sign_up_page() {
        login.setupDriver();
		obj.launchBrowser("https://testground.internsified.com/");
		login.click_signin();
		//driver.findElement(By.partialLinkText("Sign")).click();
		 
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("user enters correct data for sign up")
	public void user_enters_correct_data_for_sign_up() {
		System.out.println("done");
		login.enter_username("pritizipy1@gmail.com");
	//	driver.findElement(By.name("email")).sendKeys("pritizipy1@gmail.com");
		login.enter_pwd("123456");
		// driver.findElement(By.name("password")).sendKeys("123456");
		 
		 
		  
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("user lands on welcome page")
	public void user_lands_on_welcome_page() {
		System.out.println("done");

		login.click_submitBtn();
		
	//	driver.findElement(By.id("submit-login")).click();
		 
	}

	@Then("check user is in correct page")
	
	public void check_user_is_in_correct_page() {

		String expectedTitle= "My account";
		String actualTitle=login.get_title();

		 logAssert.assertTitle1(expectedTitle,actualTitle);
		
	}
	
	@Then("user close the browser")
	public void user_close_the_browser() {
	   obj.closeBrowser();
	}
*/
}
