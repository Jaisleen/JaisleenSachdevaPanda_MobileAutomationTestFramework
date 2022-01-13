Feature: Editing a watchlist

  Scenario: Edit an existing watchlist
    Given the user has an existing watchlist
    And the user is on watchlist screen
    When the user clicks on edit watchlist button
    Then the user can save watchlist with new name
    And the user navigates back to watchlist screen

  Scenario: Editing watching when the name is invalid
    Given the user has an existing watchlist
    And the user is on watchlist screen
    When the user clicks on edit watchlist button
    Then the user can save watchlist with new name
    And the user navigates back to watchlist screen

