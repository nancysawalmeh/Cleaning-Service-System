
Feature: discount option to customers
 
  Scenario: discount to customer 
    Given   total balance from shopping cart
    When  the total balance from shopping cart greater than "400"  successfull to discount,but if less than fail the discount
    Then  successfull to discuont  customers
    Then  fail to discuont  customers
 