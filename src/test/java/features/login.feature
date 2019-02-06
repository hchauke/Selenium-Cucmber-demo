Feature: Login into Application

Scenario Outline: Positive test validating login

Given Initialize the browser with chrome
And Navigate to "https://www.facebook.com/" Site
When User enters <username> and <password> and logs in
Then Verify that user is succesfully logged in 
When User clicks on logout link
And close the browser

Examples:
|username			|password				|
|hluly222@gmail.com	|hluly@$222@$222		|






