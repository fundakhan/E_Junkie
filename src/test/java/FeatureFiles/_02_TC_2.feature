#SCENARIO 2:
#-Navigate to "https://shopdemo.e-junkie.com/" website
#-Click on 'Add to Cart' for 'Demo eBook'
#-Click on 'Add Promo Code' button and enter "123456789"
#-Click on 'Apply'
#-Validate "Invalid promo code" message is displayed!

Feature: Apply Promo Code Validation

  @Smoke @Regression
  Scenario: Validate "Invalid promo code" message
    Given I am on the e-junkie website
    When I click on 'Add to Cart' for 'Demo eBook'
    And I click on 'Add Promo Code' button
    And I enter "123456789" as the promo code
    And I click on Apply button
    Then I should see the 'Invalid promo code' message displayed
