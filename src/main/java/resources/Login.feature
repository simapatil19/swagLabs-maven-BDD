@smoke @login
Feature: Login Functionality
  @positive
  Scenario: Succesfull login with valid credentials
    Given user is on login page
    When user enters "standard_user" and "secret_sauce"
    And user clicks on login button 
    Then user should land on home page 

  @nagative
  Scenario Outline: Unsuccesfull login with invalid credentials
    Given user is on login page
    When user enter "<username>" and "<password>"
    And click on login button
    Then user should see the "<error message>" 

    Examples: 
     |username|password|error message|
     |locked_out_user|secret_sauce| Sorry, this user has been locked out|
     |wrong-username|wrong-password| Username and password do not match any user in this service|
     