Feature: Track the orders and the status [ waiting, in treatment, complete]

 

 Scenario: Track order status
 Given when the user cheack out his order
 When the worker receive the order 
 Then in the first situation the order is waiting
 Then in the second situation the order in treatment
 Then in the third situation the order completed