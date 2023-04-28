Feature: Login in to Leaftaps Application

Background:
Given Launch the browser and load the url and maximize the window

Scenario Outline: Both Pastive and Negative
And Entetr the user name as 'Democsr'
And Entetr the password as 'crmsfa'
When click on login button
Then verify my page sucessfully login
#But verify my page not sucessfully login
When click on Lead button
And click on  Create button
And send the company name as <cnm>
And send the First name as <Fname>
And send the Last name as <Lname>
And send the Mobile Number as <num>
When click on Summit button
Then verify my page Lead sucessfully created
Examples:

|cnm|Fname|Lname|num|
|TestLeaf|Prakash|Singh|9843447673|

Scenario: Login to Negative data
And Entetr the user name as 'Democs0'
And Entetr the password as 'crmsfa'
When click on login button
But verify my page not sucessfully login
