Feature: Login to Leaptaps

Background:
When Enter Username as DemoSalesManager

@Smoke @Sanity
Scenario: Login positive flow
And Enter Password as crmsfa
And Click on Login
Then Verify HomePage is displayed

#@Sanity
#Scenario: Login Negative flow
#And Enter Password as crmsfa1
#And Click on Login
#But Verify Error message is displayed