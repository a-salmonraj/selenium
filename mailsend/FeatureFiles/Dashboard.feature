Feature: mailsend
@DashboardView
Scenario: Validate Dashboard View
When I open mailsend Url in Chrome browser
And I enter UserName in username 
And I enter Password in password
When I click on Login button in login
Then I should see Home text in Url at Global Home
Then I Click mailsend 
And I click try button
Then I should see Dashboard Header at Dashboard Url




