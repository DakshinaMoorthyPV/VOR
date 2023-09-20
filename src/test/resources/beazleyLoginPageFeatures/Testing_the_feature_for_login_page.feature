Feature: Testing_the_feature_for_login_page

  @beazley
  Scenario Outline: Testing_the_feature_for_login_page
    Given User need to be on ""
    When User checks the texts of the loginPage header "<heading>"
    When User checks the texts of the loginPage cards "<heading>"
    And User checks the texts of the loginPage footer "<footerText>"

    Examples: 
      | heading | footerText  |
      | Login   | Back to top |
