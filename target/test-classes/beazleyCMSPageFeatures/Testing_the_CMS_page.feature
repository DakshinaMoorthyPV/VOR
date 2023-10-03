Feature: Testing_the_CMS_page

  @beazley
  Scenario Outline: Testing_the_CMS_page
    Given User need to be on "Sign in to your account" "Testing_the_CMS_page"
    When User logins in the cmspage "<heading>"

    Examples: 
      | heading          |
      | Your Application |
