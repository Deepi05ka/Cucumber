package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.base.Base_Task;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BookLogin extends Base_Task {

	
	
	@Given("broswer lanuch")
	public void broswerLanuch() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	}
	@Given("url lanuch")
	public void urlLanuch() throws InterruptedException {
		driver.get("https://bookcart.azurewebsites.net");
		   Thread.sleep(5000);
	}
	@When("click the login link")
	public void clickTheLoginLink() {
		 driver.findElement(By.xpath("//span[text()='Login']")).click();
	}
	@When("enter the username as {string}")
	public void enterTheUsernameAs(String username) {
		driver.findElement(By.cssSelector("input[formcontrolname='username']")).sendKeys(username);
	}
	@When("enter the password as {string}")
	public void enterThePasswordAs(String password) {
		driver.findElement(By.cssSelector("input[formcontrolname='password']")).sendKeys(password);
	}
	@When("clik login button")
	public void clikLoginButton() throws InterruptedException {
		Thread.sleep(5000);
		  driver.findElement(By.xpath("//button[@color='primary']")).click();
	}
	@Then("login should be success")
	public void loginShouldBeSuccess() {
		String text=  driver.findElement(By.xpath("//button[contains(@class,'mat-focus-indicator mat-raised-button mat-button')]")).getText();
		System.out.println(text);
	}
	
	
}
