Feature: Validating login function of adactin webpage

  Scenario Outline: Validating login with incorrect username and incorrect password
    Given user is on adactin page on chrome
    When user enter "<username>" and "<password>"
    And user should click on login button
    Then user should validate the home page screen is visible or not
    
    Examples:
      | Username | Password |
      | hello    | heyy     |