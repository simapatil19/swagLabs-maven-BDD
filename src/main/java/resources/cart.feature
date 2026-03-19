
@smoke
Feature: cart functionality


  @tag2
  Scenario Outline: Remove product from cart
  Given user has added "<product>" to the cart
  When user remove the "<product>" from the cart
  Then  "<product>" should not appear in the cart
 
    Examples: 
     |product|
     |Sauce Labs Backpack|
