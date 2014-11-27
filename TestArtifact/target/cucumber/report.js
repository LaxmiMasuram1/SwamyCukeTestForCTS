$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/Laxmi/tests/GoogleCreateAccount.feature");
formatter.feature({
  "line": 1,
  "name": "In Order to create a Google account User",
  "description": "As a user\r\nI want be able to create a user",
  "id": "in-order-to-create-a-google-account-user",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Validate the login Message",
  "description": "",
  "id": "in-order-to-create-a-google-account-user;validate-the-login-message",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I have the Google Website Opened",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I click Gmail Link on top right side of the window",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 10,
      "value": "#Then I should see the blabla page"
    }
  ],
  "line": 11,
  "name": "I fill username with \"Test123\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I fill password with \"Test\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I should see the error Message \"The email or password you entered is incorrect.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "SampleStepDefinitions.I_have_the_Google_Website_Opened()"
});
formatter.result({
  "duration": 4446499728,
  "status": "passed"
});
formatter.match({
  "location": "SampleStepDefinitions.I_click_Gmail_Link_on_top_right_side_of_the_window()"
});
formatter.result({
  "duration": 22941,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test123",
      "offset": 22
    }
  ],
  "location": "SampleStepDefinitions.I_fill_username_with_Empty(String)"
});
formatter.result({
  "duration": 178680365,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test",
      "offset": 22
    }
  ],
  "location": "SampleStepDefinitions.I_fill_password_with(String)"
});
formatter.result({
  "duration": 82720094,
  "status": "passed"
});
formatter.match({
  "location": "SampleStepDefinitions.I_click_on_Login_Button()"
});
formatter.result({
  "duration": 3308988790,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "The email or password you entered is incorrect.",
      "offset": 32
    }
  ],
  "location": "SampleStepDefinitions.I_should_see_the_error_Message(String)"
});
formatter.result({
  "duration": 47399672,
  "status": "passed"
});
formatter.scenario({
  "line": 48,
  "name": "Validate Error message while I create Google Create User Account",
  "description": "",
  "id": "in-order-to-create-a-google-account-user;validate-error-message-while-i-create-google-create-user-account;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 24,
  "name": "I have the Google Website Opened",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "I click Gmail Link on top right side of the window",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "I should see the blabla page",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "I click on Create Account Link",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "I should be navigated Google Create Account Page",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "I am on the Google Create Account Page",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "I fill first name with a on Create Account Web part",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "I fill last name with a on Create Account Web part",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I fill choose your name a on Create Account Web part",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I fill create password with a on Create Account Web part",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I fill confirm your password with a on Create Account Web part",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "I fill birthday month with January on Create Account Web part",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "I fill birthday day with 01 on Create Account Web part",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "I fill birthday year with 1978 on Create Account Web part",
  "matchedColumns": [
    7
  ],
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "I fill gender with Male on Create Account Web part",
  "matchedColumns": [
    8
  ],
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "I fill mobile phone number with 7424305275 on Create Account Web part",
  "matchedColumns": [
    9
  ],
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "I set Set Google as my default homepage on off on Create Account Web part",
  "matchedColumns": [
    10
  ],
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "I choose location Uganda on Create Account Web part",
  "matchedColumns": [
    11
  ],
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "I set Google Terms and Conditions on on Create Account Web part",
  "matchedColumns": [
    12
  ],
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "I Click on Submit button on Create Account Web part",
  "keyword": "And "
});
formatter.match({
  "location": "SampleStepDefinitions.I_have_the_Google_Website_Opened()"
});
formatter.result({
  "duration": 3686448401,
  "status": "passed"
});
formatter.match({
  "location": "SampleStepDefinitions.I_click_Gmail_Link_on_top_right_side_of_the_window()"
});
formatter.result({
  "duration": 18413,
  "status": "passed"
});
formatter.match({
  "location": "SampleStepDefinitions.I_should_see_the_blabla_page()"
});
formatter.result({
  "duration": 12074,
  "status": "passed"
});
formatter.match({
  "location": "SampleStepDefinitions.I_click_on_Create_Account_Link()"
});
formatter.result({
  "duration": 5241442242,
  "status": "passed"
});
formatter.match({
  "location": "SampleStepDefinitions.I_should_be_navigated_Google_Create_Account_Page()"
});
formatter.result({
  "duration": 24450,
  "status": "passed"
});
formatter.match({
  "location": "SampleStepDefinitions.I_am_on_the_Google_Create_Account_Page()"
});
formatter.result({
  "duration": 12074,
  "status": "passed"
});
formatter.match({
  "location": "SampleStepDefinitions.I_fill_first_name_with_a_on_Create_Account_Web_part()"
});
formatter.result({
  "duration": 94821078,
  "status": "passed"
});
formatter.match({
  "location": "SampleStepDefinitions.I_fill_last_name_with_a_on_Create_Account_Web_part()"
});
formatter.result({
  "duration": 97706189,
  "status": "passed"
});
formatter.match({
  "location": "SampleStepDefinitions.I_fill_choose_your_name_a_on_Create_Account_Web_part()"
});
formatter.result({
  "duration": 173938556,
  "status": "passed"
});
formatter.match({
  "location": "SampleStepDefinitions.I_fill_create_password_with_a_on_Create_Account_Web_part()"
});
formatter.result({
  "duration": 132362232,
  "status": "passed"
});
formatter.match({
  "location": "SampleStepDefinitions.I_fill_confirm_your_password_with_a_on_Create_Account_Web_part()"
});
formatter.result({
  "duration": 111426614,
  "status": "passed"
});
formatter.match({
  "location": "SampleStepDefinitions.I_fill_birthday_month_with_January_on_Create_Account_Web_part()"
});
formatter.result({
  "duration": 110263877,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "01",
      "offset": 25
    }
  ],
  "location": "SampleStepDefinitions.I_fill_birthday_day_with_on_Create_Account_Web_part(int)"
});
formatter.result({
  "duration": 57448057,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1978",
      "offset": 26
    }
  ],
  "location": "SampleStepDefinitions.I_fill_birthday_year_with_on_Create_Account_Web_part(int)"
});
formatter.result({
  "duration": 58191520,
  "status": "passed"
});
formatter.match({
  "location": "SampleStepDefinitions.I_fill_gender_with_Male_on_Create_Account_Web_part()"
});
formatter.result({
  "duration": 24450,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "7424305275",
      "offset": 32
    }
  ],
  "location": "SampleStepDefinitions.I_fill_mobile_phone_number_with_on_Create_Account_Web_part(int)"
});
formatter.result({
  "duration": 62181,
  "status": "passed"
});
formatter.match({
  "location": "SampleStepDefinitions.I_set_Set_Google_as_my_default_homepage_on_off_on_Create_Account_Web_part()"
});
formatter.result({
  "duration": 11168,
  "status": "passed"
});
formatter.match({
  "location": "SampleStepDefinitions.I_choose_location_Uganda_on_Create_Account_Web_part()"
});
formatter.result({
  "duration": 12074,
  "status": "passed"
});
formatter.match({
  "location": "SampleStepDefinitions.I_set_Google_Terms_and_Conditions_on_on_Create_Account_Web_part()"
});
formatter.result({
  "duration": 42806375,
  "status": "passed"
});
formatter.match({
  "location": "SampleStepDefinitions.I_Click_on_Submit_button_on_Create_Account_Web_part()"
});
formatter.result({
  "duration": 630628539,
  "status": "passed"
});
});