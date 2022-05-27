Feature: search for car in milescarrenta

  Scenario: search airport and select car
    Given that the user enters the page milescarrenta
    When the user searches for airport and date and selects the second car
    Then the pay now button is validated

