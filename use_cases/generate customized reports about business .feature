Feature: generate customized reports about business
  As a maneger 
  I want to monitor how the business is running


    Scenario: Generate report on  services
    Given total user ,product and order
    When get all order,get all user and get all product
    Then  successfull to  generate customized reports about business

    
