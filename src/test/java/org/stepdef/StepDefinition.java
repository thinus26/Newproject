package org.stepdef;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition extends BaseClass {
	@Given("user is on adactin page on chrome")
	public void user_is_on_adactin_page_on_chrome() {
	    
	}

//	@When("user enter username and password")
	//public void user_enter_username_and_password() {
	  // WebElement txtusername = driver.findElement(By.id("username"));
	   //txtusername.sendKeys("hijava");
	  // WebElement txtpass = driver.findElement(By.id("password"));
//	   txtpass.sendKeys("14");
//	}

	@When("user enter (string) and (string)")
	public void user_enter_and(String string,String string2) {
	WebElement txtUsername = driver.findElement(By.id("username"));
	txtUsername.sendKeys(string);
	WebElement txtPass = driver.findElement(By.id("password"));
	txtPass.sendKeys(string2);
	}
	
	@When("user should click on login button")
	public void user_should_click_on_login_button() {
	   WebElement login = driver.findElement(By.id("login"));
	   login.click();
	}

	@Then("user should validate the home page")
	public void user_should_validate_the_home_page() {
	    System.out.println("invalid password");
	}

}
