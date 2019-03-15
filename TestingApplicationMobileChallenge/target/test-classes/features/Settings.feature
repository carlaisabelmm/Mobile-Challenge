Feature: Settings
  As a user with a registered account on the OLX page
  I want to verity the settings from my account

  Background:
    Given the user must have set his location
    And must have been logged in to the system
    And must be in to the home page

  Scenario: Successful change of the location of my account on the settings page
    When clicks on the menu icon
    And clicks on the settings option
    And clicks on the select location option
    Then selects a new country successfully
    And selects a new city successfully

  Scenario Outline: Succesfull delete of the the search history
    When the user has searched for <product>
    And clicks on the menu icon
    And clicks on the settings option
    And clicks on the delete search history
    Then the search history is deleted

    Examples:
      |product|
      |chair  |
      |book   |
      |xbox   |
      |jeans  |