Feature: Markets
  Scenario: Market Section
    Given the User in on the markets page
    Then the price delayed disclaimer is correctly displayed
    And the name of the market is shown
    And the rate of the market is shown
    And the change of the market is shown

  Scenario: View All Markets
    Given the User in on the markets page
    When the User decides to view all markets
    Then the name of the market is shown
    And the rate of the market is shown
    And the change of the market is shown
    And the price delayed disclaimer is correctly displayed

  Scenario: Dismissing All Markets
    Given the User in on the markets page
    When the User decides to view all markets
    And the User returns from all markets page
    Then the User returns to the markets page
    And the price delayed disclaimer is correctly displayed
    And the name of the market is shown
    And the rate of the market is shown
    And the change of the market is shown
