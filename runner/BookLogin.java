package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\lenovo\\eclipse-workspace\\CucumberConcepts\\src"
		+ "\\main\\java\\com\\feature\\BookLogin.feature",
		glue={"com.stepdefinition","com.HooksBook"},
        snippets=SnippetType.CAMELCASE,
        plugin = {"pretty","html:target/cucumber/book.html","json:target/cucumber/book.json"}
        
      )

public class BookLogin {

}
