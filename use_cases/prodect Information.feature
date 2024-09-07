Feature: Carpet and Cover Information
  As a customer 
  I want to view the full information for a carpet or cover
  
@tag1
  Scenario: View carpet information   
    Given that I am on the carpet page 
    When I view the product information section 
    Then I should see the following details:
      | Name        | Oriental Rug            |
      | Picture     | Carpet Image            |
      | Description | Handmade Polyester Rug  |
      | Price       | 30$               |
      | Material    | 100% Polyester          |
      | Cleaning    | Professional Cleaning   |
    
  
  
  Scenario: View cover information
    Given that I am on the cover page
    When I view the product information section
    Then I should see the following details:
      | Name        | Recliner Cover          |
      | Picture     | Cover Image             |
      | Description | Cotton Recliner Cover   |
      | Price       | 10$  |
      | Material    | 60% Cotton              |  
      | Cleaning    | Machine Wash            |
    