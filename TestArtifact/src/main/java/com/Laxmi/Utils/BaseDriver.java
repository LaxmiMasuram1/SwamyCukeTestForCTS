package com.Laxmi.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseDriver {

		//public static WebDriver driver;
		
		protected  WebDriver driver;
		
		public BaseDriver(){
			//driver= new InternetExplorerDriver();
			driver= new ChromeDriver();
		}
		
		
}
