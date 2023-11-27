package com.stepdefinition;


import org.openqa.selenium.By;

import com.base.Base_Task;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Book extends Base_Task{

	@Given("User should naviagate to the application")
	public void userShouldNaviagateToTheApplication() {
	    browserLaunch("chrome");
	    LaunchUrl("https://bookcart.azurewebsites.net");
	}
	@Given("User should login as {string} and {string}")
	public void userShouldLoginAsAnd(String username, String password ) {
	    driver.findElement(By.xpath("(//span[text()='Login'])[1]")).click();
	    sendKeys(driver.findElement(By.id("mat-input-0")), username);
	    sendKeys(driver.findElement(By.id("mat-input-1")), password );
	    driver.findElement(By.xpath("(//span[text()='Login'])[2]")).click();
	}
	@Given("user search a {string}")
	public void userSearchA(String book) {
	    driver.findElement(By.xpath("//input[@aria-label='search']")).sendKeys(book);
	    driver.findElement(By.xpath("//span[@class='mat-option-text']")).click();
	}
	@When("User add the book to the cart")
	public void userAddTheBookToTheCart() {
	   driver.findElement(By.xpath("//button[@color='primary']")).click();
	   try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	@Then("the cart bage should be updated")
	public void theCartBageShouldBeUpdated() throws InterruptedException {
		System.out.println("the cart bage should be updated");
	 driver.quit();
	}

}
