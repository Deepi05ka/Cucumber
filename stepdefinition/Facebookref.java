package com.stepdefinition;

import org.openqa.selenium.By;

import com.base.Base_Task;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Facebookref extends Base_Task{

	@Given("User is on the Facebook login page")
	public void user_is_on_the_facebook_login_page() {
	    browserLaunch("chrome");
	    LaunchUrl("https://www.facebook.com");
	}

	@When("User enters valid {string} and {string}")
	public void user_enters_valid_and(String username, String password) {
		
	    driver.findElement(By.id("email")).sendKeys(username);
	    driver.findElement(By.id("pass")).sendKeys(password);
	}

	@When("User clicks on the login button")
	public void user_clicks_on_the_login_button() {
	    driver.findElement(By.name("login")).click();
	}

	@Then("User should be logged in successfully")
	public void user_should_be_logged_in_successfully() {
	    System.out.println("User should be logged in successfully");
	}


}
