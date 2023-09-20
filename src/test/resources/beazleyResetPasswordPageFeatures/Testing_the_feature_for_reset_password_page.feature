Feature: Testing_the_feature_for_reset_password_page

  @beazley
  Scenario Outline: Testing_the_feature_for_reset_password_page
    Given User need to be on ""
    When User checks the texts of the resetPasswordPage header "<heading>"
    When User checks the texts of the resetPasswordPage cards "<heading>"
    And User checks the texts of the resetPasswordPage footer "<footerText>"

    Examples: 
      | heading        | footerText  |
      | Reset Password | Back to top |
