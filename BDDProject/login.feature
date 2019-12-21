Feature: login credential

Scenario: user should be able to login using valid credential

Given open chrome browser
And Navigate to url - always use either capital or lower case for all test cases
When user type userId in userid text box
And user type password in passward text box
And user click in login button
Then user should see his profile page


#Scenario: user should be able to login using invalid credential
#
#Given open chrome browser
#And Navigate to url - always use either capital or lower case for all test cases
#When user type userId in userid text box
#And user type password in passward text box
#And user click in login button
#Then user should not see his profile page