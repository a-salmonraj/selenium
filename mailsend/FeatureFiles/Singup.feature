Feature: mailsend
@singupinsingledata
Scenario: Validate SIgnup Module
When I open Signup Url in Chrome browser
And I enter Email ID
When I click Get Started
And I enter name
And I enter company name
And I enter create password
And I Choose Industry
And I choose Region 
And I enter mobile number
When I click on Save and continue button
Then I should see home text in Url
When I Close home page browser