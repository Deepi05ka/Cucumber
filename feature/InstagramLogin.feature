Feature: Instagram

  Scenario: Login to instagram
    Given Launch the browser
    When User enter the url
    And User enter a phone no
    And User enter a password
    And User click a login button
    And User enter a code
    And click a confirm button
    Then User should login into instagram
