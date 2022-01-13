Feature: Deleting a watchlist

  Scenario: Delete an existing watchlist
    Given the user has an existing watchlist
    And the user is on watchlist screen
    When the user clicks on edit watchlist button
    And the user clicks on delete watchlist button
    Then the watchlist should be deleted