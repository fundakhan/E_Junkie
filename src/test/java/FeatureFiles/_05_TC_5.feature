#SCENARIO 5:
#-Navigate to "https://shopdemo.e-junkie.com/" website
#-Click on 'Add to Cart' for 'Demo eBook'
#-Click on 'Pay using Debit Card'
#-Fill the Billing Details Form (use fake data)
#-Enter Card number as "4242 4242 4242 4242"
#-Enter Expiration as "12/22" and CVV as "000"
#-Click on 'Pay' button
#-Validate you navigate to the confirmation page and "Thank you!" message is displayed!

Feature: Purchase eBook with Debit Card

  @Smoke @Regression
  Scenario: Successful Purchase with Debit Card
    Given I am on the e-junkie website
    When I click on 'Add to Cart' for 'Demo eBook'
    And I click on Pay using Debit Card button
    And I fill the Billing Details Form with fake data
      |tof55Qgmail.com|
      |tof55Qgmail.com|
      |Toffee Tof     |
    And I enter the Card number as
    |4242 4242 4242 4242 12/25 000|
    And I click on Pay button
    Then I should be navigated to the confirmation page and see the "Thank you!" message is displayed
