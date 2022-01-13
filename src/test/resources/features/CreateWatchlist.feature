Feature: Create a new watchlist

  Scenario: No watchlist created
    Given the user is on watchlist page
    When the user has no watchlist added
    Then the user should see an add watchlist button
    And the name of the screen should be correctly displayed
    And page information on the screen should be correctly displayed.

  Scenario: Prevent watchlist creation when no name is given
    Given the user is on watchlist page
    When the user tries to create a watchlist without entering a name
    Then the user should be unable to click on create watchlist button to create a watchlist

  Scenario: Prevent watchlist creation when the name is invalid
    Given the user is on watchlist page
    When the user tries to create a watchlist by entering invalid data
    Then the user should be unable to create watchlist

  Scenario: Create watchlist page
    Given the user is on watchlist page
    When the user clicks on create watchlist button
    Then the user should be taken to create watchlist page

  Scenario 5: Adding a new watchlist
    Given the user is on create watchlist page
    When the user enters a valid name
    Then a watchlist should be created

  Scenario: Add a new watchlist
    Given Click Watchlist tab
    Given Click Create a Watchlist
    Given Enter Watchlist Name
    Given Click Add a Watchlist
    Then Watchlist is created successfully

