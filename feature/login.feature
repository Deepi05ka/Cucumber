Feature: Connecting a peoples

  Scenario: Singup in facebook
    Given User can able to enter a home page
    When User click a create account
    And User enters their first name in given filed
    And User enters their last name in given filed
    And User enters their email address in given filed
    And User enters their password in given filed
    And User selects their date of birth
    And User selects their gender
    And User clicks on the Sign Up button
    Then Validate the current page
