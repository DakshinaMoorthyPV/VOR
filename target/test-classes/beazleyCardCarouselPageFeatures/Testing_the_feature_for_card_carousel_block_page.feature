Feature: Testing_the_feature_for_card_carousel_block_page

  @beazley
  Scenario Outline: Testing_the_feature_for_card_carousel_block_page
    Given User need to be on "" "Testing_the_feature_for_card_carousel_block_page"
    When User checks the logo displayed
    When I am at the cardcarouselblock page
    When I click on the Country dropdown in Footer Section
    Then I click on BackToTop link, Arrow icon and Beazley Logo in Footer Section
    And The Copyright text should display with correct Text
    Then I click on all the links in Footer Social, Primary and Secondary Block
    
     @beazley  
    Scenario Outline: Card Carousel Block Page Header section & cardcarousalblockvalidation
    Given User need to be on "" "Card Carousel Block Page Header section & cardcarousalblockvalidation"
    When I am at the cardcarouselblock page
    When I able to view the Headercomponents in Page Header
    And I able to view all the cardcarousalblock and get each name of the cardcarousalblock in page
