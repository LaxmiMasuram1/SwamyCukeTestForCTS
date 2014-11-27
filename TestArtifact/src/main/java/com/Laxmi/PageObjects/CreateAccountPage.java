package com.Laxmi.PageObjects;

import org.apache.bcel.generic.RETURN;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateAccountPage {

	final WebDriver driver;

	public CreateAccountPage(WebDriver driver)
	{
		this.driver=driver;
		 //WebDriver driver = new InternetExplorerDriver();
	}

	
	@FindBy(how = How.ID, using = "FirstName")
	 
	public WebElement txt_FirstName;
 
	@FindBy(how = How.ID, using = "LastName")
	 
	public WebElement txt_LastName;
 
	@FindBy(how = How.ID, using = "GmailAddress")
	 
	public WebElement txt_GmailAddress;
 
	@FindBy(how = How.ID, using = "Passwd")
	 
	public WebElement txt_Passwd;
 
	@FindBy(how = How.ID, using = "PasswdAgain")
	 
	public WebElement txt_PasswdAgain;
 
	@FindBy(how = How.ID, using = ":0")
	 
	public WebElement ddl_BirthdayMonth;
	
	@FindBy(how = How.ID, using = ":1")
	 
	public WebElement ddl_MenuItem;
	
	@FindBy(how = How.ID, using = "BirthDay")
	 
	public WebElement txt_BirthDay;
	
	@FindBy(how = How.ID, using = "BirthYear")
	 
	public WebElement txt_BirthYear;
	
	@FindBy(how = How.ID, using = ":d")
	 
	public WebElement ddl_GenderMenu;
		
	@FindBy(how = How.ID, using = ":e")
	 
	public WebElement ddl_GenderMenuItem;
			
	@FindBy(how = How.ID, using = "RecoveryPhoneNumber")
	 
	public WebElement txt_RecoveryPhoneNumber;
		
	@FindBy(how = How.ID, using = "RecoveryEmailAddress")
	 
	public WebElement txt_RecoveryEmailAddress;
		
	@FindBy(how = How.ID, using = "SkipCaptcha")
	 
	public WebElement txt_SkipCaptcha;
		
	@FindBy(how = How.ID, using = "recaptcha_response_field")
	 
	public WebElement txt_recaptchaResponseField;
		
	@FindBy(how = How.ID, using = "TermsOfService")
	 
	public WebElement chb_TermsOfService;

	@FindBy(how = How.ID, using = "submitbutton")
	 
	public WebElement btn_submitbutton;
	
	@FindBy(how = How.ID, using = "errormsg_0_FirstName")
	 
	public WebElement lbl_errorMsgFirstName;
	
		
	@FindBy(how = How.XPATH, using = "//div[@id='name-form-element']/span[@id='errormsg_0_FirstName']")
	public WebElement lnk_ErrorMsgFirstName;
	
	
	@FindBy(how = How.ID, using = "errormsg_0_signupcaptcha")
	public WebElement lbl_ErrorMsgCaptcha;
	
	
	
	
	


//	public WebElement getLnkGmail() {
//		return driver.findElement(By.linkText("Gmail"));
//	}

	
//	public WebElement getTxtFirstName() {
//		return driver.findElement(By.id("FirstName"));
//	}
//	
//	public WebElement getTxtLastName() {
//		return driver.findElement(By.id("LastName"));
//	}

//	public WebElement getTxtGmailAddress() {
//		return driver.findElement(By.id("GmailAddresst"));
//	}
//	
//	public WebElement getTxtPasswd() {
//		return driver.findElement(By.id("Passwd"));
//	}
//	
//	public WebElement getTxtPasswdAgain() {
//		return driver.findElement(By.id("PasswdAgain"));
//	}
//	
//	public WebElement getDdlBirthdayMonth() {
//		return driver.findElement(By.id(":0"));
//	}
//	
//	public WebElement getDdlMenuItem() {
//		return driver.findElement(By.id(":1"));
//	}
//	
//
//	public WebElement getTxtDay() {
//		return driver.findElement(By.id("BirthDay"));
//	}
//
//	public WebElement getTxtYear() {
//		return driver.findElement(By.id("BirthYear"));
//	}
//
//	public WebElement getDdlGenderMenu() {
//		return driver.findElement(By.id(":d"));
//	}
//
//		
//	public WebElement getDdlGenerMenuItem() {
//		return driver.findElement(By.id(":e"));
//	}
//
//	public WebElement getTxtRecoverPhoneNo() {
//		return driver.findElement(By.id("RecoveryPhoneNumber"));
//	}
//	
//
//	public WebElement getTxtRecoveryEmailID() {
//		return driver.findElement(By.id("RecoveryEmailAddress"));
//	}
//		
//	public WebElement getChbSkpCaptcha() {
//		return driver.findElement(By.id("SkipCaptcha"));
//	}
//	
//	
//	public WebElement getTxtRecaptchaResponse() {
//		return driver.findElement(By.id("recaptcha_response_field"));
//	}
//		
//	
//	public WebElement getChbTC() {
//		return driver.findElement(By.id("TermsOfService"));
//	}
//		
//	public WebElement getBtnSubmitButton() {
//		return driver.findElement(By.id("submitbutton"));
//	}
//			
//	
//	public WebElement getErrorMessage(){
//	
//		return driver.findElement(By.id("errormsg_0_FirstName"));
//		//return driver.findElement(By.tagName("//div[@id='name-form-element']/span[@id='errormsg_0_FirstName']"));
//	}
//	

	
}
