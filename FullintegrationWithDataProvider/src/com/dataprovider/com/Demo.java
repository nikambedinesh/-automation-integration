package com.dataprovider.com;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.utility.com.Utility;

public class Demo extends Utility {

	
	@BeforeClass
	public void Configsetting() {
		driversetting("file:///C:/selenium%20software/Offline%20Website/index.html");
	}
	
	@Test(priority =1)
	public void login() {
		System.out.println("u r in login");
	}
	
	@DataProvider(name="logindata"){
		
		
	}
	
	
	
	
	
}
