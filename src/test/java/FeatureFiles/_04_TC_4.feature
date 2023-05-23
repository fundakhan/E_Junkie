#SCENARIO 4:
#-Navigate to "https://shopdemo.e-junkie.com/" website
#-Click on 'Add to Cart' for 'Demo eBook'
#-Click on 'Pay using Debit Card'
#-Fill the Billing Details Form (use fake data)
#-Enter Card number as "1111 1111 1111 1111"
#-Validate "Invalid Card Number" message is displayed!


 Feature: Invalid Card Number Validation

   @Smoke @Regression
   Scenario: Validate Invalid Card Number Message
     Given I am on the e-junkie website
     When I click on 'Add to Cart' for 'Demo eBook'
     And I click on Pay using Debit Card button
     And I fill the Billing Details Form with fake data
     |tof55Qgmail.com|
     |tof55Qgmail.com|
     |Toffee Tof     |
     And I enter the Card number as
     |1111 1111 1111 1111|
     Then I should see the "Invalid Card Number" invalid data message displayed