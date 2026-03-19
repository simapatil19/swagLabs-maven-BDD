
@tag
Feature: CheckOut Overview Functionality

  @tag1
  Scenario: Verify order summery
    Given user is on checkout overview page
    Then product details and total amount should be displyed on page

  @tag2
  Scenario Outline: Continue to next page
  Given user is on checkout overview page
  When user click on "<Button>"
  Then user should be navigated to "<nextpage>"

    Examples: 
     | Button | nextpage |
     | Finish | FinishPage |
     | cancle | HomePage |
  
