Feature: Testing_the_feature_for_vor_page

  @beazley
  Scenario Outline: Testing_the_feature_for_vor_page
    Given User need to be on ""
    When User checks the texts of the vorPage header
    When User checks the texts of the vorPage cards "<heading>"
    And User checks the texts of the vorPage footer "<footerText>"

    Examples: 
      | heading              | footerText |
      | Substantial weakness | Events     |
