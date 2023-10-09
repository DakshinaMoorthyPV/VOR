Feature: Testing the feature for validating components of Application Selection page

  @beazley
  Scenario Outline: Testing the feature for validating components of Application Selection page
    Given User need to be on ""
    When User checks the texts of the applicationSelectionPage header "<heading>"
    When User checks the texts of the applicationSelectionPage cards "<oneMoreHeading>"
    And User checks the texts of the applicationSelectionPage footer "<footerText>"

    Examples: 
      | heading          | footerText | oneMoreHeading    |
      | Your Application | Events     | Your Applications |
