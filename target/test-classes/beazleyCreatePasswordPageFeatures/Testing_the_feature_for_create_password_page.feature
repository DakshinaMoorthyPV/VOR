Feature: Testing_the_feature_for_create_password_page

  @beazley
  Scenario Outline: Testing_the_feature_for_create_password_page
    Given User need to be on ""
    When User checks the texts of the createPasswordPage header "<heading>"
    When User checks the texts of the createPasswordPage cards "<heading>"
    And User checks the texts of the createPasswordPage footer "<footerText>"

    Examples: 
      | heading         | footerText  |
      | Create Password | Back to top |
