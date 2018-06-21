Feature: Yahoo Login 

@Yahoo
Scenario: Validate Invalid Password 
Given User is on Yahoo Login Page
When user submits the name
|useryahooemailid		  |
|aksenthil2002@yahoo.co.in|
Then user submits the invalid password
|invalidpassword|
|aksenthilk     |

@uiPractice
Scenario: Validate Title
Given user is on uipractice page
When clicks on Home Link
Then user lands on Home page

@Justanswer
Scenario: Login to Justanswer
Given user in on Justanswer Home page
When user clicks on continue button
Then user should see the error message "Enter your question here to continue..."


