package com.runner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\lenovo\\eclipse-workspace\\"
		+ "CucumberConcepts\\src\\main\\java\\com\\feature\\Book.feature",
		glue = "com.stepdefinition",
		snippets = SnippetType.CAMELCASE)
public class book {

}
