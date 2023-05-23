#SCENARIO 1:
#-Navigate to "https://shopdemo.e-junkie.com/”
#-Click on 'Add to Cart' for 'Demo eBook'
#-Validate cart item no is '1'
#-Click on 'Remove' button to remove item from your cart
#-Click on 'Continue Shopping'
#-Validate cart item no is '0'

Feature: Validate cart functionality on shopdemo.e-junkie.com

  @Smoke @Regression
  Scenario: Remove item from the cart and verify cart count
    Given I am on the e-junkie website
    When I click on 'Add to Cart' for 'Demo eBook'
    Then The cart item count should be 1
    When I click on the 'Remove' button
    And I click on 'Continue Shopping'
    Then The cart item count should be 0