#SCENARIO 3:
#-Navigate to "https://shopdemo.e-junkie.com/" website
#-Click on 'Add to Cart' for 'Demo eBook'
#-Click on 'Pay using Debit Card'
#-Click on 'Pay' button without filling any information
#-Validate "Invalid Email - Invalid Email - Invalid Billing Name" message is displayed!

Feature:

  @Smoke @Regression
  Scenario: Validate error message when paying with invalid information
    Given I am on the e-junkie website
    When I click on 'Add to Cart' for 'Demo eBook'
    And I click on Pay using Debit Card button
    And I click on Pay button
    Then I should see the 'Invalid Email - Invalid Email - Invalid Billing Name' error message displayed