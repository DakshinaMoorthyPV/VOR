Feature: Image Block validation

  #	@beazley
  #	Scenario Outline: imageblock Page Footer validation
    #Given I am at the cardcarouselblock page
    #When I click on the Country dropdown in Footer Section
    #Then I click on BackToTop link, Arrow icon and Beazley Logo in Footer Section
    #And The Copyright text should display with correct Text
    #Then I click on all the links in Footer Social, Primary and Secondary Block
    #
    #@beazley  
    #Scenario Outline: imageblock Page Header section & imageblock validation
    #Given I am at the cardcarouselblock page Header
    #When I able to view the Headercomponents in Page Header
    #And I able to view all the cardcarousalblock and get each name of the cardcarousalblock in page
    
    @beazley  
    Scenario Outline: Testing_the_feature_for_image_block
    Given User need to be on ""
    When I am at the ImageBlock page validate image display 
    
    @beazley
    Scenario Outline: Testing Page Header
    When I am at the cardcarouselblock page Header
    

