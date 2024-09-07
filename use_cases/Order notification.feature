Feature: Order notification

Scenario: Notify customer by email when the order is complete
  Given  when order with the status "complete"
  When  the worker sends a notification email to the customer
  Then the customer should receive the email
  