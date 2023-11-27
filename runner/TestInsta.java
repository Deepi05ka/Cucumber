package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\lenovo\\eclipse-workspace\\CucumberConcepts\\"
		+ "src\\main\\java\\com\\feature\\InstagramLogin.feature",
		glue = "com.stepdefinition")
public class TestInsta {

}
