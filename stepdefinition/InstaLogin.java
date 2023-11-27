package com.stepdefinition;

import com.base.Base_Task;
import com.pom.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InstaLogin extends Base_Task {
	
	PageObjectManager ob = new PageObjectManager();

	@Given("Launch the browser")
	public void launch_the_browser() {
	   browserLaunch("chrome");
	}
	@When("User enter the url")
	public void user_enter_the_url() {
	    LaunchUrl("https://www.instagram.com/");
	}
	@When("User enter a phone no")
	public void user_enter_a_phone_no() {
	    sendKeys(ob.getInstaLogin().getPhoneno(), "7708038495");
	}
	@When("User enter a password")
	public void user_enter_a_password() {
	    sendKeys(ob.getInstaLogin().getPassword(), "Deep@1234");
	}
	@When("User click a login button")
	public void user_click_a_login_button() {
	    clickonElement(ob.getInstaLogin().getLogin());
	}
	@When("User enter a code")
	public void user_enter_a_code() {
	    System.out.println("Enter a code");
	}
	@When("click a confirm button")
	public void click_a_confirm_button() {
	    System.out.println("click a confirm button");
	}
	@Then("User should login into instagram")
	public void user_should_login_into_instagram() {
	   System.out.println("Home page opend");
	}
}
