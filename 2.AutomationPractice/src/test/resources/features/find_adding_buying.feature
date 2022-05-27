Feature: Finding, adding and buying dresses


  Background:
    Given the already registered user logs in successfully

  Scenario: Search a dress
    When the user searches for a dress
    Then the user validates the results of dressesl

  Scenario: Browse the dress tab
    When the user navigates to the dress tab
    Then the user validates the results list of dresses

  Scenario: filter by highest price and add to cart
    When the user navigates to the dresses tab and filters by the highest price
    Then the user adds the first product in the list to the cart