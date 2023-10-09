Feature: Testing the feature for validating timeout popup of Application Selection page

  @beazley
  Scenario Outline: Testing the feature for validating timeout popup of Application Selection page
    Given User need to be on ""
    When User checks texts of applicationSelectionPage timeout session popup "<heading>"

    Examples: 
      |heading              |
      |Session due to expire|
