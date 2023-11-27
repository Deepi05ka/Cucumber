Feature: Facebook login

  Background: 
    Given User is on the Facebook login page

  Scenario Outline: login
    When User enters valid "<username>" and "<password>"
    And User clicks on the login button
    Then User should be logged in successfully

    Examples: 
      | username     | password         |
      | valid_email  | validpass2       |
      | Invalid_emai | Invalid@password |

      