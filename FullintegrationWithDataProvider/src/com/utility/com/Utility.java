package com.utility.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utility {
	
	WebDriver driver;
	public void driversetting(String url) {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		 driver=new ChromeDriver();
			
			driver.get("url");
	}

}
