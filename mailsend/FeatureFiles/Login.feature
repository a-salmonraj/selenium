Feature: mailsend
@loginsingledata
Scenario: Validate Login Module
When I open Url in Chrome browser
And I enter UserName
And I enter Password
When I click on Login button
Then I should see Dashboard text in Url
When I close browser

@loginwithmultipledata
Scenario Outline: Validate Login with multiple data
When I open Url in "<Browser>"
And I enter "<UserName>" in username
And I enter "<Password>" in password
When I Click on Login
Then Verify Dashboard text in Url
When Close browser
Examples:
|Browser|UserName|Password|
|Chrome|mantra.qa12@gmail.com|mantra123|
|Chrome|Admin|123456|
|Chrome|Admin|test123|
|Chrome|mantra.qa12@gmail.com|mantra123|

