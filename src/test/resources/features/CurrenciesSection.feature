Feature: Currencies
  Scenario: Currencies  Section
    Given the User in on the markets page
    When the User scrolls to the Currencies section
    Then the name of the Currency is shown
    And the rate of the Currency is shown
    And the change of the Currency is shown

  Scenario: Currencies Switching
    Given the User in on the markets page
    When the User scrolls to the Currencies section
    And the User selects currency
    Then currency rate becomes opposite

    Scenario: Prices delayed disclaimer
      Given the User in on the markets page
      When the User scrolls to the Currencies section
      Then the price delayed disclaimer is correctly displayed

      Scenario: Rate disclaimer
        Given the User in on the markets page
        When the User scrolls to the Currencies section
        Then rate disclaimer is shown

