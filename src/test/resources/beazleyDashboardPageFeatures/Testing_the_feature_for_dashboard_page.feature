Feature: Testing_the_feature_for_dashboard_page

  @beazley
  Scenario Outline: Testing_the_feature_for_dashboard_page
    Given User need to be on ""
    When User checks the texts of the dashboardPage header
    When User checks the texts of the dashboardPage cards "<heading>"
    And User checks the texts of the dashboardPage footer "<footerText>"

    Examples: 
      | heading               | footerText |
      | Widespread Ransomware | Events     |
