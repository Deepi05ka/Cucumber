package com.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FbStepdefinition {
	@Given("User can able to enter a home page")
	public void user_can_able_to_enter_a_home_page() {
	    System.out.println("Fackbook home page");
	}
	@When("User click a create account")
	public void user_click_a_create_account() {
	    System.out.println("User click a create account");
	}
	@When("User enters their first name in given filed")
	public void user_enters_their_first_name_in_given_filed() {
	    System.out.println("first name");
	}
	@When("User enters their last name in given filed")
	public void user_enters_their_last_name_in_given_filed() {
	    System.out.println("last name");
	}
	@When("User enters their email address in given filed")
	public void user_enters_their_email_address_in_given_filed() {
	    System.out.println("email address ");
	}
	@When("User enters their password in given filed")
	public void user_enters_their_password_in_given_filed() {
	    System.out.println("password");
	}
	@When("User selects their date of birth")
	public void user_selects_their_date_of_birth() {
	    System.out.println("date of birth");
	}
	@When("User selects their gender")
	public void user_selects_their_gender() {
	   System.out.println("gender");
	}
	@When("User clicks on the Sign Up button")
	public void user_clicks_on_the_sign_up_button() {
	    System.out.println("Sign Up button");
	}
	@Then("Validate the current page")
	public void validate_the_current_page() {
	    System.out.println("Validation");
	}


}
