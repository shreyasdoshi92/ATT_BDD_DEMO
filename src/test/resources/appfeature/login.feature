Feature: Login functionality

Scenario: login to the application
Given User is at login page
When User enters the username
And User enters the password
And User clicks on login button
Then User redirects to home page


Scenario: login to the application
Given User is at login page
When User enters the username
And User enters the password
And User clicks on login button
Then Verify title of the landing page


