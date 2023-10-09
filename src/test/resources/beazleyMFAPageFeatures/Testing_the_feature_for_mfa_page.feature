Feature: Testing_the_feature_for_mfa_page

  @beazley
  Scenario Outline: Testing_the_feature_for_mfa_page
    Given User need to be on ""
    When User checks the texts of the mfaPage header "<heading>"
    When User checks the texts of the mfaPage cards "<heading>"
    And User checks the texts of the mfaPage footer "<footerText>"

    Examples: 
      | heading                | footerText  |
      | Complete account setup | Back to top |
