Feature: Regression Testing

  Scenario Outline: Verify Page Loaded Successfully.

    When User Logs in to application "<pagename>" "<url>" "<report>"   
    And check the page loads
    Then User should be landed successfully    
     
    Examples: 
      | pagename              |url                                                                                           | report|    
      | ProductCategory PageCotingency|  https://uat.dxp.beazley.com/en-US/test-pages/insurance-product-category |  verified ProductCategory Navigation & Page Load|              
      | Industry    |  https://uat.dxp.beazley.com/en-US/test-pages/pt-13---industrypage |verified  Industry Navigation &Page Load|  
      | Event    |  https://uat.dxp.beazley.com/en-US/test-pages/testpage---c-17---eventcarouselblock---page|verified  Event Navigation & Page Load|  
      | Person  |  https://uat.dxp.beazley.com/en-US/test-pages/pt-3---personpage|verified Person page Navigation & Page Load|  
      | Article      |  https://uat.dxp.beazley.com/en-US/test-pages/pt-7---articlepage  |verified  Article page Navigation & Page Load|  
      | Event    |https://uat.dxp.beazley.com/en-US/test-pages/testpage---c-73---eventlistingblock---page|verified  Event Page Navigation & Page Load|  
      | homepageHeroBlock   |  https://uat.dxp.beazley.com/en-US/test-pages/pt-1---homepage|verified  Home Page Navigation & Page Load| 
      | genericHeroBlock    | https://uat.dxp.beazley.com/en-US/test-pages/testpage---c-05---genericheroblock---page|verified  Generic Hero Block Page Navigation & page load|  
      | calloutBlock    |   https://uat.dxp.beazley.com/en-US/test-pages/testpage---calloutanimationitemblock---page|verified  Call Out Block Page Navigation & page load|  
      | iconCardsBlock    |  https://uat.dxp.beazley.com/en-US/test-pages/testpage---iconcardblock---page|verified  IconCards Block Page Navigation & page load|  
      | tabbed-person   |https://qa.dxp.beazley.com /en/test-pages/testpage---c-12---calloutgroupblock---horizontal---page|verified  Tabbed Person Page Navigation & page load|  
      | cardCarouselBlock 	 | https://uat.dxp.beazley.com/en-US/test-pages/testpage---c-15---cardcarouselblock---page  |verified  Card Carousel Block Navigation & page load|  
      | eventCarouselBlock  | https://uat.dxp.beazley.com/en-US/test-pages/testpage---c-17---eventcarouselblock---page | verified  Event Carousel Block Page Navigation & page load|  
      | videoCardBlock   | https://uat.dxp.beazley.com/en-US/test-pages/testpage---c-21---videocardblock---page         |verified  video card block Page Navigation & page load|  
      | imageBlock  |    https://uat.dxp.beazley.com/en-US/test-pages/testpage---c-27---imageblock---page|verified  Image Page Navigation & page load|  
      
      
   Scenario Outline: Verify broker contact form client services.

    When User Logs in to application "<pagename>" "<url>" "<report>" 
    And Validate service form questions and options
    Examples: 
      | pagename              |url                                                                                           |   report|      
      | brokercontactformclientservices |  https://uat.dxp.beazley.com/en-US/test-pages/testpage---c81---client-services---page | validated Service Form Questions & Options listing|          
      
         
    Scenario Outline: validate broker contact form general feedback.

    When User Logs in to application "<pagename>" "<url>" "<report>" 
    And Validate broker contact form generalfeedback
    Examples: 
      | pagename              |url                                                                                                       |   report|      
      | brokercontactformgeneralfeedback |  https://uat.dxp.beazley.com/en-US/test-pages/testpage---c81---formgeneralfeedbackblock---page | validated Broker Contract Form General Feedback|   
      
      
    Scenario Outline: validate broker contact form general feedback.

    When User Logs in to application "<pagename>" "<url>" "<report>" 
    And Validate broker contact form my BeazleySupport
    Examples: 
      | pagename              |url                                                                                                       |   report|      
      | brokercontactformmyBeazleysupport |  https://uat.dxp.beazley.com/en-US/test-pages/testpage---c81---formgeneralfeedbackblock---page | validated Broker Contact From My BeazleySupport|  
  
  
      
   Scenario Outline: validate customer contact form.

    When User Logs in to application "<pagename>" "<url>" "<report>" 
    And Validate customer contact form
    Examples: 
      | pagename              |url                                                                                                       |   report|      
      | customercontactform |  https://uat.dxp.beazley.com/en-US/test-pages/testpage---c82---customer-contact-form---page | validated customer contact form|        
      
      
Scenario Outline: validate customer form cyberaccess 3rd party

    When User Logs in to application "<pagename>" "<url>" "<report>" 
    And Validate customer form cyberaccess 3rd party
    Examples: 
      | pagename              |url                                                                                                       |   report|      
      | customerformcyberaccess3rdparty |  https://uat.dxp.beazley.com/en-US/test-pages/testpage---c82---cyber-access-third-party-services---page | validated Customer Form Cyberaccess 3rd Party|   
      
Scenario Outline: validate document listing

    When User Logs in to application "<pagename>" "<url>" "<report>" 
    And Validate document listing filter
    Examples: 
      | pagename              |url                                                                                                       |   report|      
      | Documentlistingfilter | https://uat.dxp.beazley.com/en-US/test-pages/testpage---c-78---documentlistingblock---page | validated Document listing Filter|  
      
Scenario Outline: validate event information

    When User Logs in to application "<pagename>" "<url>" "<report>" 
    And Validate event information display
    Examples: 
      | pagename              |url                                                       |   report|      
      | EventInformation | https://uat.dxp.beazley.com/en-US/test-pages/pt-8---eventpage | validated Event Information Display and Content|  
      
      
Scenario Outline: validate genericheroblock

    When User Logs in to application "<pagename>" "<url>" "<report>" 
    And Validate genericheroblock display
    Examples: 
      | pagename              |url                                                       |   report|      
      | GenericHeroBlock | https://uat.dxp.beazley.com/en-US/test-pages/testpage---c-05---genericheroblock---page | validated Generic Hero Block Display and Modal Content|     
      
      
Scenario Outline: validate Header Block

    When User Logs in to application "<pagename>" "<url>" "<report>" 
    And Validate headerblock display
    Examples: 
      | pagename              |url                                                       |   report|      
      | HeaderBlock | https://uat.dxp.beazley.com/en-US/test-pages/testpage---c-15---cardcarouselblock---page | validated Header Block Display and Content| 
      
Scenario Outline: validate Footer Block

    When User Logs in to application "<pagename>" "<url>" "<report>" 
    And Validate footerblock display
    Examples: 
      | pagename              |url                                                       |   report|      
      | FooterBlock | https://uat.dxp.beazley.com/en-US/test-pages/testpage---c-15---cardcarouselblock---page | validated Footer Display and Link Navigation|      
      
         
      
                                  