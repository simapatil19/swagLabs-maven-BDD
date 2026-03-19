
@smoke
Feature: Home Page Functionality

  @tag1
  Scenario: Verify products are displyed 
  Given user has logged in succesfully
  Then all available products should be visible on home page

  @tag2
  Scenario Outline: Add product to the cart
  Given User is on home page
  When user add "<product>" to the cart 
  Then "<product>" should be visible in the cart
  
  Examples:
  |product|
  | Sauce Labs Backpack   |
  | Sauce Labs Bike Light |
