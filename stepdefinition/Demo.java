package com.stepdefinition;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import com.base.Base_Task;

public class Demo extends Base_Task {
	 public static void brows() {
		 browserLaunch("chrome");
		 LaunchUrl("https://www.instagram.com/");
		 WebElement phoneno = driver.findElement(By.name("username"));
		 sendKeys(phoneno, "7708038495");
		 WebElement password = driver.findElement(By.name("password"));
		 sendKeys(password, "AlishaDeep@1234");
		 driver.findElement(By.xpath("//div[text()='Log in']")).click();
	 }

	public static void main(String[] args) {
		brows();

	}

}
