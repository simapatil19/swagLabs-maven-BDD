

 @smoke @finish
Feature: Finish page functionality

  @confirmation
  Scenario: Verify order completion
    Given user is on the finish page
    Then user should see a confirmation message
    And order should be marked as complete