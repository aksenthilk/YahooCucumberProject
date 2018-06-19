Feature: Yahoo Login 
Scenario: Validate Invalid Password 
Given User is on Yahoo Login Page
When user submits the name
|useryahooemailid		  |
|aksenthil2002@yahoo.co.in|
Then user submits the invalid password
|invalidpassword|
|aksenthilk     |
Then error message is displayed