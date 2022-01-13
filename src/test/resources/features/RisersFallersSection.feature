Feature: Risers & Fallers Section
  Scenario: FTSE100
    Given the User in on the markets page
    When the User scrolls to the FTSE One Hundred tab
    Then five biggest raisers are shown in order
    And five biggest fallers are shown in order
    And the disclaimer is correctly displayed

  Scenario: FTSE250
    Given the User in on the markets page
    When the User scrolls to the FTSE Two Hundred Fifty tab
    Then five biggest raisers are shown in order
    And five biggest fallers are shown in order
    And the disclaimer is correctly displayed

  Scenario: FTSE_ALL_SHARE
    Given the User in on the markets page
    When the User scrolls to the FTSE ALL SHARE tab
    Then five biggest raisers are shown in order
    And five biggest fallers are shown in order
    And the disclaimer is correctly displayed

