Feature: Login to Leaptaps

Background:
Given Launch the chrome browser
And Load the URL and maximize

Scenario: Login positive flow
When Enter Username as DemoSalesManager
And Enter Password as crmsfa
And Click on Login
Then Verify HomePage is displayed

Scenario: Login Negative flow
When Enter Username as 'Demo'
And Enter Password as 'crmsfa1'
And Click on Login
But Verify Error message is displayed