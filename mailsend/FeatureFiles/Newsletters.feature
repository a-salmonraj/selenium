Feature: mailsend
@NewsLetters
Scenario: Validate Newsletters Page functionality
When I click on Newsletters button in Menu
Then I should see newsletters text in Url 
#And I click  Add Newsletter button
And I Click on Add custom
And I Fill all the fields with valid data
#And I Edit the template using HTML or MJML editor
Then I Click on Save button
Then I should see added customised Newsletter in Newsletter page




