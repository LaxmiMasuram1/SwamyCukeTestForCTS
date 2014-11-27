package com.Laxmi.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import com.Laxmi.PageObjects.*;
import com.Laxmi.Utils.*;


public class SampleStepDefinitions extends BaseDriver {

	GoogleHomePage HomePage; 
	CreateAccountPage createAccountPage;
	public SampleStepDefinitions()
	{
		super();
		driver.manage().deleteAllCookies();
		HomePage = PageFactory.initElements(driver, GoogleHomePage.class);
		createAccountPage= PageFactory.initElements(driver, CreateAccountPage.class);
	}
	//WebDriver driver;

	@Given("^I have the Google Website Opened$")
	public void I_have_the_Google_Website_Opened() {
		driver.navigate().to("http://gmail.com");
	}

	
	@When("^I click Gmail Link on top right side of the window$")
	public void I_click_Gmail_Link_on_top_right_side_of_the_window() throws Throwable {
		
	}

	@Then("^I should see the blabla page$")
	public void I_should_see_the_blabla_page() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	  //  throw new PendingException();
	}


	@When("^I fill username with \"([^\"]*)\"$")
	public void I_fill_username_with_Empty(String arg1) throws Throwable {
		HomePage.txt_Email.sendKeys(arg1);
	}

	@When("^I fill password with \"([^\"]*)\"$")
	public void I_fill_password_with(String arg1) throws Throwable {
		HomePage.txt_Passwd.sendKeys(arg1);
	}

	@When("^I click on Login Button$")
	public void I_click_on_Login_Button() throws Throwable {
		HomePage.btn_signIn.click();
		try{
			Thread.sleep(3000);
		}catch(Exception e){}
		
	}

	@Then("^I should see the error Message \"([^\"]*)\"$")
	public void I_should_see_the_error_Message(String arg1) throws Throwable {
		
		Assert.assertTrue(HomePage.lbl_ErrorMsgPassword.getText().contains(arg1));
		//Assert.(HomePage.lbl_ErrorMsgPassword.getText(), arg1);
	}

	
	@Then("^close the Application now$")
	public void close_the_Application_now() throws Throwable {
			driver.close();
		
	}

	
	
	
	@When("^I click on Create Account Link$")
	public void I_click_on_Create_Account_Link() throws Throwable {
		
//		if(HomePage.chb_PersistentCookie.getAttribute("checked").equals("true"))
//		{
//			//disable it
//			HomePage.chb_PersistentCookie.click();
//			driver.wait(2000);
//		}
				
		HomePage.lnk_CreateAnAccount.click();
		try
		{
			Thread.sleep(5000);
		}catch(Exception e)
		{
		
		}
		
		//driver.wait(5000);
	}

	@Then("^I should be navigated Google Create Account Page$")
	public void I_should_be_navigated_Google_Create_Account_Page() throws Throwable {
	}
	
	
	@Given("^I am on the Google Create Account Page$")
	public void I_am_on_the_Google_Create_Account_Page() throws Throwable {

		
	}

	@When("^I fill first name with a on Create Account Web part$")
	public void I_fill_first_name_with_a_on_Create_Account_Web_part() throws Throwable {
		createAccountPage.txt_FirstName.sendKeys("hello");
	}

	@When("^I fill last name with a on Create Account Web part$")
	public void I_fill_last_name_with_a_on_Create_Account_Web_part() throws Throwable {
		createAccountPage.txt_LastName.sendKeys("lastname");
	}

	@When("^I fill choose your name a on Create Account Web part$")
	public void I_fill_choose_your_name_a_on_Create_Account_Web_part() throws Throwable {
		createAccountPage.txt_GmailAddress.sendKeys("swamy.masuram123");
	}

	@When("^I fill create password with a on Create Account Web part$")
	public void I_fill_create_password_with_a_on_Create_Account_Web_part() throws Throwable {
		createAccountPage.txt_Passwd.sendKeys("tTest123");
	}

	@When("^I fill confirm your password with a on Create Account Web part$")
	public void I_fill_confirm_your_password_with_a_on_Create_Account_Web_part() throws Throwable {
		createAccountPage.txt_PasswdAgain.sendKeys("tTest123");
	}

	@When("^I fill birthday month with January on Create Account Web part$")
	public void I_fill_birthday_month_with_January_on_Create_Account_Web_part() throws Throwable {
		//createAccountPage.txt_BirthYear.sendKeys("1978");
		createAccountPage.ddl_BirthdayMonth.click();
		createAccountPage.ddl_MenuItem.click();
	}

	@When("^I fill birthday day with (\\d+) on Create Account Web part$")
	public void I_fill_birthday_day_with_on_Create_Account_Web_part(int arg1) throws Throwable {
		createAccountPage.txt_BirthDay.sendKeys("01");
	}

	@When("^I fill birthday year with (\\d+) on Create Account Web part$")
	public void I_fill_birthday_year_with_on_Create_Account_Web_part(int arg1) throws Throwable {
		createAccountPage.txt_BirthYear.sendKeys("1977");
	}

	@When("^I fill gender with Male on Create Account Web part$")
	public void I_fill_gender_with_Male_on_Create_Account_Web_part() throws Throwable {
	}

	@When("^I fill mobile phone number with (\\d+) on Create Account Web part$")
	public void I_fill_mobile_phone_number_with_on_Create_Account_Web_part(int arg1) throws Throwable {
	}

	@When("^I set Set Google as my default homepage on off on Create Account Web part$")
	public void I_set_Set_Google_as_my_default_homepage_on_off_on_Create_Account_Web_part() throws Throwable {
	}

	@When("^I choose location Uganda on Create Account Web part$")
	public void I_choose_location_Uganda_on_Create_Account_Web_part() throws Throwable {
	}

	@When("^I set Google Terms and Conditions on on Create Account Web part$")
	public void I_set_Google_Terms_and_Conditions_on_on_Create_Account_Web_part() throws Throwable {
		createAccountPage.chb_TermsOfService.click();
	}


	
	@When("^I Click on Submit button on Create Account Web part$")
	public void I_Click_on_Submit_button_on_Create_Account_Web_part() throws Throwable {
		createAccountPage.btn_submitbutton.click();
		
		if (createAccountPage.lbl_ErrorMsgCaptcha.getText().equals("The characters you entered didn't match the word verification. Please try again."))
		{
			Assert.assertEquals(createAccountPage.lbl_ErrorMsgCaptcha.getText(), "The characters you entered didn't match the word verification. Please try again.");
			System.out.println("******"+createAccountPage.lbl_ErrorMsgCaptcha.getText());
			Assert.assertEquals(createAccountPage.lbl_ErrorMsgCaptcha.getText(), "The characters you entered didn't match the word verification. Please try again.");

		}

		
	}

	
	
}







