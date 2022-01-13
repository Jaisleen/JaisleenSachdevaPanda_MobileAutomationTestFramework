Feature: Commodities
  Scenario: Commodities  Section
    Given the User in on the markets page
    When the User scrolls to the Commodities section
    Then the name of the commodity is shown
    And the rate of the commodity is shown
    And the change of the commodity is shown

  Scenario: Commodities Disclaimers
    Given the User in on the markets page
    When the User scrolls to the Commodities section
    Then the price delayed disclaimer is correctly displayed
    And the data policy disclaimer is correctly displayed

