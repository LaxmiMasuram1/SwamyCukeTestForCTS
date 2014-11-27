Feature: In Order to create a Google account User
As a user
I want be able to create a user


Scenario: Validate the login Message

Given I have the Google Website Opened
When I click Gmail Link on top right side of the window
#Then I should see the blabla page
And I fill username with "Test123"
And I fill password with "Test"
And I click on Login Button
Then I should see the error Message "The email or password you entered is incorrect."
#And  close the Application now




 
 
Scenario Outline: Validate Error message while I create Google Create User Account

Given I have the Google Website Opened
When I click Gmail Link on top right side of the window
Then I should see the blabla page
When I click on Create Account Link
Then I should be navigated Google Create Account Page
Given I am on the Google Create Account Page
When I fill first name with <FirstName> on Create Account Web part
And I fill last name with <LastName> on Create Account Web part
And I fill choose your name <ChooseYourName> on Create Account Web part
And I fill create password with <CreatePassword> on Create Account Web part
And I fill confirm your password with <ConfirmYourPassword> on Create Account Web part
And I fill birthday month with <BirthMonth> on Create Account Web part
And I fill birthday day with <BirthDay> on Create Account Web part
And I fill birthday year with <BirthYear> on Create Account Web part
And I fill gender with <Gender> on Create Account Web part
And I fill mobile phone number with <MobilPhoneNo> on Create Account Web part
And I set Set Google as my default homepage on <OnOffDefaultPage> on Create Account Web part
And I choose location <locationCountry> on Create Account Web part
And I set Google Terms and Conditions <OnOffTC> on Create Account Web part
And I Click on Submit button on Create Account Web part

   
Examples:
   |FirstName	|LastName	|ChooseYourName	|CreatePassword	|ConfirmYourPassword	|BirthMonth	|BirthDay	|BirthYear	|Gender		|MobilPhoneNo			|OnOffDefaultPage	|locationCountry	|OnOffTC	|ExpectedMessage|
   |a			|	a		|	a			|	a			|	a					|	January	|01			|	1978	|	Male	|	7424305275			|		off			|	Uganda			|	on		|				|

 

