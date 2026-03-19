
@smoke
Feature: Checkout Functionality
  
  @tag1
  Scenario Outline: Enter checkout information
  Given user is on the cart page
  When user clicks on checkout button
  And user enters "<Firstname>" ,"<lastname>" and "<postalCode>"
  Then user should navigated to Checkout Overview Page
  
  Examples:
  |Firstname|lastname|postalCode|
  |Jone|Doe|411028|
  |Cherry|Ram|411309|