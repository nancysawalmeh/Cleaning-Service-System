
Feature: generate invoice for customer
 
  Scenario:  invoice for customer
    Given   delivery, price ,address,items 
    When  the invoice delivery<" It takes 3 to 4 days"> and price<50.56> and address <"nablus"> and items  <"string">
    Then  successfull generate invoice for customer
  


      
