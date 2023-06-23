

@Retirement-calculator
Feature: Verifying the functionality of Pre-Retirement calculator

  @VerifyTheCalculator
# Scenario: To Verify Pre-retirement calculator when social security income is YES
#    Given I Launch The Browser
#    When I Open The Pre-retirement calculator
#    Then Common details of the form
#    And Fill the additional Fields
#    And Submit the application
#    Then Validate results
#    Then Edit Info
#    Then Clear form

   Scenario: To Verify Pre-retirement calculator when social security income is NO
      Given I Launch The Browser
      When I Open The Pre-retirement calculator
      Then Common details of the form
      Then Submit the application
      Then Validate results
      Then Edit Info
      Then Clear form
      Then Close the browser

#   Scenario: To Verify Pre-retirement calculator when social security income is NO
#      Given I Launch The Browser
#      When I Open The Pre-retirement calculator
#      Then Submit the form without filling the mandatory fields
#      Then Error messages should be displayed
#      Then Clear form
#









