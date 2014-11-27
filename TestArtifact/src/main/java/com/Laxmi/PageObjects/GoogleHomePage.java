package com.Laxmi.PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
 
import org.openqa.selenium.support.FindBy;
 
import org.openqa.selenium.support.How;

public class GoogleHomePage {

	
	final WebDriver driver;
	

	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Gmail")
	
	public WebElement lnk_Gmail;
 
	@FindBy(how = How.LINK_TEXT, using = "Create an account")
	
	public WebElement lnk_CreateAnAccount;

	@FindBy(how = How.ID, using = "PersistentCookie")
	
	public WebElement chb_PersistentCookie;

	
	@FindBy(how = How.ID, using = "Email")
	
	public WebElement txt_Email;
	

	@FindBy(how = How.ID, using = "Passwd")
	
	public WebElement txt_Passwd;

	
	@FindBy(how = How.ID, using = "signIn")
	
	public WebElement btn_signIn;
	

	@FindBy(how = How.ID, using = "errormsg_0_Passwd")
	
	public WebElement lbl_ErrorMsgPassword;
	
	
	@FindBy(how = How.ID, using = "errormsg_0_Email")
	
	public WebElement lbl_ErrorMsgEmail;
	
	
	@FindBy(how = How.XPATH, using = ".//*[@id='account_logout']/a")
 
	public WebElement lnk_LogOut;
	
	public GoogleHomePage(WebDriver driver)
	{
		this.driver=driver;
		 //WebDriver driver = new InternetExplorerDriver();
	}
	

	public WebElement getLnkGmail() {
		return driver.findElement(By.linkText("Gmail"));
	}


	public WebElement getLnkCreateAccount() {
		return driver.findElement(By.linkText("Create an account"));
	}

	
	
}




 