Feature: Testing_the_feature_for_login_mfa_page

  @beazley
  Scenario Outline: Testing_the_feature_for_login_mfa_page
    Given User need to be on ""
    When User checks the texts of the loginMFA header "<heading>"
    When User checks the texts of the loginMFA cards "<heading>"
    And User checks the texts of the loginMFA footer "<footerText>"

    Examples: 
      | heading | footerText |
      | Login   | Careers    |
