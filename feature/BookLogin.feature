Feature: BookCart Application

  Background: 
    Given broswer lanuch
    And url lanuch

  Scenario: page on success
    When click the login link
    And enter the username as "ortoni"
    And enter the password as "pass1234"
    And clik login button
    Then login should be success
