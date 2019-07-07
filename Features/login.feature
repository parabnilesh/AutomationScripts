Feature: Login feature test
Scenario: Login to the site
Given Launch browser
Given Enter URL
When Enter Username
And Enter Password
And Click Submit button
Then Successful login should be displayed