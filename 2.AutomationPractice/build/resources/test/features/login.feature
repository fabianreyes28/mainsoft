Feature:login with valid credentials


  Scenario:successful login
    Given the registered user logs in to the page automationpractice
    When the user enters valid credentials
    Then validates successful login