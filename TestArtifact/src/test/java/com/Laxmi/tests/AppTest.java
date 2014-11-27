package com.Laxmi.tests;

import java.io.Console;
import java.io.File;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.Laxmi.PageObjects.CreateAccountPage;
import com.Laxmi.PageObjects.GoogleHomePage;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.Collections;
import java.util.Map;


/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
  	/*
    	// Create a new instance of the html unit driver
        // Notice that the remainder of the code relies on the interface, 
        // not the implementation.
        WebDriver driver = new InternetExplorerDriver();
//        // And now use this to visit Google
        driver.get("http://www.google.com");

//    	WebDriver driver = new RemoteWebDriver(DesiredCapabilities.chrome());
//    	driver.get("http://www.google.com");
//    	

//        WebDriver driver = new ChromeDriver();
////        // And now use this to visit Google
//        driver.get("http://www.google.com");

        try{
        	driver.wait(5000);
        }catch(Exception e)
        {
        }

        
//        ChromeOptions options = new ChromeOptions();
//        options.addExtensions(new File("/path/to/extension.crx"));
//        WebDriver driver = new ChromeDriver(options);
//        driver.get("http://www.google.com");
//        

//    	Map<String, Object> = new Map<String, Object>();
//    	
//       // Map<String, Object> chromeOptions = new Map<String, Object>(); 
//
//        chromeOptions.put("binary", "/usr/lib/chromium-browser/chromium-browser");
//        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//        capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
//        WebDriver driver = new ChromeDriver(capabilities);
        
        
        GoogleHomePage googlePage= new GoogleHomePage(driver);
        googlePage.getLnkGmail().click();
        googlePage.getLnkCreateAccount().click();
        
        try{
        	driver.wait(8000);
        }catch(Exception e)
        {
        }

        
        CreateAccountPage  createAccountPage= new CreateAccountPage(driver);
        
       // createAccountPage.getTxtFirstName().sendKeys("test");
//        createAccountPage.getTxtLastName().sendKeys("test");
//        createAccountPage.getTxtGmailAddress().sendKeys("test");
//        createAccountPage.getTxtPasswd().sendKeys("test");
//        createAccountPage.getTxtPasswdAgain().sendKeys("test");
//        createAccountPage.getDdlBirthdayMonth().click();
//        createAccountPage.getDdlMenuItem().click();
//        createAccountPage.getDdlGenderMenu().click();
//        createAccountPage.getDdlGenerMenuItem().click();
//        createAccountPage.getTxtRecoverPhoneNo().sendKeys("35235252345");
//        createAccountPage.getTxtRecoveryEmailID().sendKeys("Hello");
//        createAccountPage.getTxtRecaptchaResponse().sendKeys("Hello");
        
//        createAccountPage.getChbTC().click();
//        createAccountPage.getBtnSubmitButton().click();
//   
//        
//        try{
//        	driver.wait(5000);
//        }catch(Exception e)
//        {
//        }
//        
//        
//        //assertEquals("You can't leave this empty.", createAccountPage.getErrorMessage().getText());
//        
//        assertEquals("span", createAccountPage.getErrorMessage().getTagName());
//        
//
//        // Check the title of the page
//        System.out.println("Page title is: " + driver.getTitle());
        

        driver.quit();
        assertTrue( true );
        
        */
    }
}
