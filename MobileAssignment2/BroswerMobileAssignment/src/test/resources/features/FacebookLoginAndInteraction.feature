Feature: Facebook Login functionality

  Scenario: Successful login
    Given the user is on the Facebook login page
    When the user enters a valid username and password
    

  Scenario: Invalid login
    Given the user is on the Facebook login page
    When the user enters an invalid username or password
    