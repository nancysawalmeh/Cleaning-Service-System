
Feature: login


 Background: login
    Given  Given  I have the following username and passowrd in the store

    | nancy sawalmeh |*** |
    | ayat sawalmeh | 1234 |
    | masa rateb    | 123 |
    
     
   Scenario: Find name by username 
    When I search for name by username <"nancy sawalmeh"> and by Password <"***">
    Then I find 1 admin
  
   Scenario: Find name by username 
  When I search for name by username <"ayat sawalmeh"> and by Password <"1234">
  Then I find 1  Customer
  
	Scenario: Find name by username
  When I search for name by username <"masa rateb"> and by Password <"123">
  Then I find 1  Worker


  